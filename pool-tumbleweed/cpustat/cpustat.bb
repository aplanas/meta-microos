SUMMARY = "Periodic cpu utilization statistics"
DESCRIPTION = "cpustat periodically reports the current CPU utilization of running tasks and \
can optionally report per CPU and per task utilization statistics at the end \
of a run. \
cpustat has been designed and optimized to use a minimal amount of CPU cycles \
to monitor a system hence it is a light weight alternative to traditional \
process monitoring tools such as top."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.15"

RPM_NAME = "cpustat-0.02.15-1.9.aarch64.rpm"
RPM_HASH = "688d57fa2cd6d690801094a185a98e580a215d7868b168984a6c50c4612afb23d763531c17b4a4cdf2a6b5543fd7bf6ac7b18912e46d9f5b50b2a61f57762f47"

RPROVIDES:${PN} += "cpustat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
