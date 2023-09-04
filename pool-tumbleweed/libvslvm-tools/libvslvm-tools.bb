SUMMARY = "Several tools for reading Linux Logical Volume Manager (LVM) systems"
DESCRIPTION = "Several tools for reading Linux Logical Volume Manager (LVM) volume \
systems. \
 \
See libvslvm for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-tools-20221025-5.1.aarch64.rpm"
RPM_HASH = "b0f4083e4e0a6d2c748454483d9fc25c97e0c90c0401b366aed0d366c616107322988af1f3b8845b2ff84ca8877e29a0595d4d738eafc8a5bb5d83a67451ee7c"

RPROVIDES:${PN} += "libvslvm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse.so.2 \
libvslvm.so.1"

inherit rpm
