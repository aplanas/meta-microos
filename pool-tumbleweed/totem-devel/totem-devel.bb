SUMMARY = "Developer Documentation for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package contains developer documentation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-devel-43.0-2.4.aarch64.rpm"
RPM_HASH = "10bb7f66d45f7781c1ac8dbb7d5f28462954e6db91ea9396a50cfb2f6d6a032455ba18ad4db8ac9cd434ad3a02409ebde048b88f0ab2d8cafd294a3c4fd60b2b"

RPROVIDES:${PN} += "pkgconfig-totem \
totem-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-totem-plparser \
totem"

inherit rpm
