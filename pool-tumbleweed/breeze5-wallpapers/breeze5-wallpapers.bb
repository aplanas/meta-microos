SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze wallpaper theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "breeze5-wallpapers-5.27.6-1.1.noarch.rpm"
RPM_HASH = "2bbfb97d16ab39be7ad9bfe76217a1a7daeea43126193022afe980ecb68b42078f3cd9c20a4f300b57b26edc0d04bf39a6ff61ba9e054c945e178e135e3b0be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
