SUMMARY = "Deepin Wallpapers"
DESCRIPTION = "Deepin Wallpapers provides wallpapers of Deepin Desktop."
LICENSE = "CC0-1.0"

PV = "1.7.10"

RPM_NAME = "deepin-wallpapers-1.7.10-1.7.noarch.rpm"
RPM_HASH = "317702085bff1113a8983b2ee9040892f76b7afc00076bcac819f90c90929b53df21f291fdf58c8f0aef9bb3a213d41e80b06213602c183f11098e655187faa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-wallpapers"
RDEPENDS:${PN} += ""

inherit rpm
