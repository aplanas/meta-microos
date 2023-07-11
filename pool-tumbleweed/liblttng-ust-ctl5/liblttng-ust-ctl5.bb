SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "liblttng-ust-ctl5-2.13.5-1.4.aarch64.rpm"
RPM_HASH = "167365244927925b03ca4e4d19eba24e3ca5143cc6e4632f93eddf554af4d6d65a5a848a3281e306e7e05a93d9fe64cde2f90069a5553dab445afd9131b5ff31"

RPROVIDES:${PN} += "liblttng-ust-ctl.so.5 \
liblttng-ust-ctl5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblttng-ust-common.so.1 \
libnuma.so.1"

inherit rpm
