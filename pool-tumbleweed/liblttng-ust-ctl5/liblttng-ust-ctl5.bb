SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "liblttng-ust-ctl5-2.13.5-1.3.aarch64.rpm"
RPM_HASH = "6f08c9a3ff7db19beab765251d9cf204007f119c169dc145eba33f5cd016e69b2a54ef59c434308e91758ea06ad42d72b8213389ed4eca513e9684fca30aef4b"

RPROVIDES:${PN} += "liblttng-ust-ctl.so.5()(64bit) \
liblttng-ust-ctl5 \
liblttng-ust-ctl5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblttng-ust-common.so.1()(64bit) \
libnuma.so.1()(64bit)"

inherit rpm
