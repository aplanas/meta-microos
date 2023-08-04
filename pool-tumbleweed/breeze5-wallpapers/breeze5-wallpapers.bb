SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze wallpaper theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "breeze5-wallpapers-5.27.7-1.1.noarch.rpm"
RPM_HASH = "b318280b1c444cfad568a66c4c97ad36c8517d1c79aae05053614a3b867dc8323b1205eed989304a43ba775589326508f525614e5afaee4722181b305736052b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
