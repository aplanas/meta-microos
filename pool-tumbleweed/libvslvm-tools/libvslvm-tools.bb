SUMMARY = "Several tools for reading Linux Logical Volume Manager (LVM) systems"
DESCRIPTION = "Several tools for reading Linux Logical Volume Manager (LVM) volume \
systems. \
 \
See libvslvm for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-tools-20221025-4.1.aarch64.rpm"
RPM_HASH = "e8908dd79ae8e213cddb58de4815bc19573fbf384585a23fd976f5af974cdaf0dcfa3ad7702f052c0f585f76b6ac360ba4a4c7831aabb17b32beff4f6cffae68"

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
