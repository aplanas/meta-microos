SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze wallpaper theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "breeze5-wallpapers-5.27.5-1.1.noarch.rpm"
RPM_HASH = "22f3d2eeeecee9ee4d459b94f032283d3876ec2370b8b417e0340fc6ecd1f55e835bc19da46ea9dcf9671f90e3aa6c8956f97d7f3aa983e8f93aca289208473d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-wallpapers"
RDEPENDS:${PN} += ""

inherit rpm
