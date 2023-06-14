SUMMARY = "Header files for MATE Control Center"
DESCRIPTION = "The control center is MATE's main interface for configuration of various \
aspects of your desktop. \
 \
This package provides MATE control center development files."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-control-center-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "83590a02d4c4b811ce34d2d9722f73998ff3148d5397f3970a579a652d3b3c54d54c4cb911e69305561568b0dbbebf5a1a5158d5d72158de16fbfe286c916eac"

RPROVIDES:${PN} += "mate-control-center-devel \
pkgconfig-mate-default-applications \
pkgconfig-mate-keybindings \
pkgconfig-mate-window-settings-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-window-settings1 \
pkgconfig-gtk+-3.0 \
pkgconfig-mate-desktop-2.0"

inherit rpm
