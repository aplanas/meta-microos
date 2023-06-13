SUMMARY = "openSUSE Branding of the Cinnamon Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Cinnamon \
desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "42.2"

RPM_NAME = "libcinnamon-desktop-data-branding-openSUSE-42.2-5.18.noarch.rpm"
RPM_HASH = "f4e61b9343ca9efbb687a0c1cbd11a72a18bbc6828a1798e9c99ed96cbe09fa42325e01cefa1ac252ba2d1c739b42c0b5f331ffa4901e9d0c7e5b12889fad14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-data-branding \
libcinnamon-desktop-data-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
adwaita-icon-theme \
libcinnamon-desktop-data \
wallpaper-branding-openSUSE"

inherit rpm
