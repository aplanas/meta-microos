SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze wallpaper theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "breeze5-wallpapers-5.27.4-2.1.noarch.rpm"
RPM_HASH = "a76727c75090657b195d3b0f966b13a8367c8ff65a73c2cc38bfd7200737e0eb9b7ac5cba6d6523bb67fdd4c2491ad3673171a2e5c90fc88651d247bd1a38580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-wallpapers"
RDEPENDS:${PN} += ""

inherit rpm
