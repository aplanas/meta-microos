SUMMARY = "Icon theme for Xfce complementing Adwaita"
DESCRIPTION = "This icon theme is an extension for Adwaita fixing missing icons that are used in Xfce. \
It is not a complete theme and inherits the bulk of icons from Adwaita."
LICENSE = "GPL-2.0-only"

PV = "0.0.3+git0.e0f73b9"

RPM_NAME = "adwaita-xfce-icon-theme-0.0.3+git0.e0f73b9-2.2.noarch.rpm"
RPM_HASH = "790edb95f5af4e7f2380354789ea0ba6fdc6993569c866e433f4959cbc4b4c7443b87b424908d3610d55a9d685f0abe8c1ea6ed44f9df2f4b379d0308624777a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adwaita-xfce-icon-theme \
openSUSE-xfce-icon-theme"
RDEPENDS:${PN} += "adwaita-icon-theme"

inherit rpm
