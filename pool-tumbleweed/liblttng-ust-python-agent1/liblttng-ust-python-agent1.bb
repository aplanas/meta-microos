SUMMARY = "Linux Trace Toolkit Userspace Tracer Python agent library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "liblttng-ust-python-agent1-2.13.5-1.3.aarch64.rpm"
RPM_HASH = "90c09713772ed98e81fd89360cc1073dc8eb066d4b4b20ce0e9fa29ed2b24e1b9a8cc5a91e89e6aa84ba9acbb5d59738b9b4a93cee4a8edf2bfd8a97c83d181f"

RPROVIDES:${PN} += "liblttng-ust-python-agent.so.1()(64bit) \
liblttng-ust-python-agent1 \
liblttng-ust-python-agent1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblttng-ust.so.1()(64bit)"

inherit rpm
