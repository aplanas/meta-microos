SUMMARY = "Developer Documentation for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package contains developer documentation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-devel-43.0-2.3.aarch64.rpm"
RPM_HASH = "f26cfd04c6129d7b5ac98274cd10314581dffd4bf669e51dae94951cfbb9433895f12a4d37e2dc75d90a42bc6065dc5ef3716ced459e051a3098a170b2fadbfb"

RPROVIDES:${PN} += "pkgconfig-totem \
totem-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-totem-plparser \
totem"

inherit rpm
