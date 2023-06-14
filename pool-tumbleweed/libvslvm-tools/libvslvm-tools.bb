SUMMARY = "Several tools for reading Linux Logical Volume Manager (LVM) systems"
DESCRIPTION = "Several tools for reading Linux Logical Volume Manager (LVM) volume \
systems. \
 \
See libvslvm for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-tools-20221025-3.7.aarch64.rpm"
RPM_HASH = "a26709357c479793ccc0a53453be3b7711a1ae99f517f4c879bfd383735483a1d8fc8df27024ca256ed9490415326b4989dbe211ec64f1598a44a1492bc4d146"

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
