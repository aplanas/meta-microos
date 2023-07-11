SUMMARY = "Linux Trace Toolkit Userspace Tracer Python agent library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "liblttng-ust-python-agent1-2.13.5-1.4.aarch64.rpm"
RPM_HASH = "1d097d87c2f911059f2a8d157cbb439759b843a0d67d8a61581a4a5161d61f994270c49ed600ca4276f7b7a1254bca296fca7719d97a72c4023b317fc1254857"

RPROVIDES:${PN} += "liblttng-ust-python-agent.so.1 \
liblttng-ust-python-agent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblttng-ust.so.1"

inherit rpm
