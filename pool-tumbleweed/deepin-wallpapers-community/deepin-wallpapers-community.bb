SUMMARY = "Deepin Community Wallpapers"
DESCRIPTION = "Deepin Wallpapers Community provides community wallpapers of Deepin Desktop."
LICENSE = "CC0-1.0"

PV = "1.7.10"

RPM_NAME = "deepin-wallpapers-community-1.7.10-1.7.noarch.rpm"
RPM_HASH = "7c9e9ec7a27c191f0733d1958884c557471bc4ea081b7d4284d513c3bed83b65d0f78870017ea89c7a02aecdca79c6db5387bb19f005a1375724b153c726ca1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-wallpapers-community"

RDEPENDS:${PN} += ""

inherit rpm
