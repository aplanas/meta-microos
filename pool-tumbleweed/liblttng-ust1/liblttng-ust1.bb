SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "liblttng-ust1-2.13.5-1.4.aarch64.rpm"
RPM_HASH = "08711f8b039574d5fde9de42114ee4040447493148ef8e60b742e530e06b4bc15f387937365f2eb9e34a8b2f0aa3d26b523423bb22c1dc86426c29db00c43770"

RPROVIDES:${PN} += "liblttng-ust-common.so.1 \
liblttng-ust-cyg-profile-fast.so.1 \
liblttng-ust-cyg-profile.so.1 \
liblttng-ust-dl.so.1 \
liblttng-ust-fd.so.1 \
liblttng-ust-fork.so.1 \
liblttng-ust-libc-wrapper.so.1 \
liblttng-ust-pthread-wrapper.so.1 \
liblttng-ust-tracepoint.so.1 \
liblttng-ust.so.1 \
liblttng-ust1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1"

inherit rpm
