SUMMARY = "Search appliance sample app"
DESCRIPTION = "Search appliance sample app that demonstate how the kiosk \
compositor is used."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-kiosk-sample-app-44.0-1.2.noarch.rpm"
RPM_HASH = "b3d9852dd22e446b6160d905ae92d883a0d5fdc0057eeda91fb36911ecf1ed4b2805d8ed5bde5c8d322047083c16cad28e1a4b4d97e34c39c20aa847de1eefde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-kiosk-sample-app"

RDEPENDS:${PN} += "MozillaFirefox \
gnome-kiosk"

inherit rpm
