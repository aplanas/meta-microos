SUMMARY = "Thumbnailer for folders"
DESCRIPTION = "A thumbnailer to show custom folder thumbnails in Thunar"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-folder-thumbnailer-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "692fb68f997a32331d62da937efb6f6bb2f21885eb24a43d297091cd0c9872045c4f67aad7d6ca0e6707f3b6dd751964c6508f9f10fe7be484b8ea4fc225efcf"

RPROVIDES:${PN} += "tumbler-folder-thumbnailer \
tumbler-folder-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ImageMagick"

inherit rpm
