SUMMARY = "Development files for the libbd_fs plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_fs plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_fs-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "1678e0dda56f53282aeebf1eb76d1a360d382afd97a8c87aac25bf541ffeed8cdd6b025f354d2b64fb8895cfbd87425f6947b50cff63ab72e0ead927cc519a07"

RPROVIDES:${PN} += "libbd_fs-devel \
libbd_fs-devel(aarch-64) \
libblockdev-fs-devel"

RDEPENDS:${PN} += "dosfstools \
glib2-devel \
libbd_fs2 \
libbd_utils-devel \
xfsprogs"

inherit rpm
