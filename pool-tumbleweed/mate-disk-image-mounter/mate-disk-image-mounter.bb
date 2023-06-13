SUMMARY = "MATE disk image mounter"
DESCRIPTION = "This is the MATE Disk Image Mounter as shipped with the MATE \
utilities. mate-disk-image-mounter shows up in Caja for .ISO files \
to be conviniently mounted."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-disk-image-mounter-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "4e29d02ca33c799feabbcd15ddfc2759b2bfb2f1740c48e941cbeb2d261b5fb5dcc715cc55a00cd5653b435fdc717ec88cc6cd99052e62b4d33d7f1bb5d5d4ce"

RPROVIDES:${PN} += "application() \
application(mate-disk-image-mounter.desktop) \
mate-disk-image-mounter \
mate-disk-image-mounter(aarch-64) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-raw-disk-image)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libudisks2.so.0()(64bit)"

inherit rpm
