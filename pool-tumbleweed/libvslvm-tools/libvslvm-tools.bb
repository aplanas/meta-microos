SUMMARY = "Several tools for reading Linux Logical Volume Manager (LVM) systems"
DESCRIPTION = "Several tools for reading Linux Logical Volume Manager (LVM) volume \
systems. \
 \
See libvslvm for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-tools-20221025-3.9.aarch64.rpm"
RPM_HASH = "0961e384f0a1827fa97bd822c40955857c6a9376cbf8ad377158d8f91f349140575819a9f65a5de5f78d747e423596808b2662d435eca6755849212d63d29b30"

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
