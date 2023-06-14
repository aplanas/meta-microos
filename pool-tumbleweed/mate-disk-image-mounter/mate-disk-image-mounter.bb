SUMMARY = "MATE disk image mounter"
DESCRIPTION = "This is the MATE Disk Image Mounter as shipped with the MATE \
utilities. mate-disk-image-mounter shows up in Caja for .ISO files \
to be conviniently mounted."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-disk-image-mounter-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "4e29d02ca33c799feabbcd15ddfc2759b2bfb2f1740c48e941cbeb2d261b5fb5dcc715cc55a00cd5653b435fdc717ec88cc6cd99052e62b4d33d7f1bb5d5d4ce"

RPROVIDES:${PN} += "mate-disk-image-mounter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libudisks2.so.0"

inherit rpm
