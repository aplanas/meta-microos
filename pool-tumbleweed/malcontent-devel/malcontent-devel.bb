SUMMARY = "Devel package"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-devel-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "11ddfdfe073ec7ef0068a3a596583d0f6d47fd6bbd0f0fe4b2140458b314cb621f4ccf41f247bf248bcace924713716e88130c66c1d74cb00dfaaff8849cdfea"

RPROVIDES:${PN} += "malcontent-devel \
pkgconfig-malcontent-0 \
pkgconfig-malcontent-ui-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmalcontent-0-0 \
libmalcontent-ui-0-0 \
pkgconfig-accountsservice \
pkgconfig-appstream-glib \
pkgconfig-flatpak \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-malcontent-0 \
typelib-1-0-Malcontent-0 \
typelib-1-0-MalcontentUi-0"

inherit rpm
