SUMMARY = "openSUSE Extra Wallpapers"
DESCRIPTION = "Extra wallpapers for openSUSE Leap 15"
LICENSE = "CC-BY-2.0 & CC-BY-SA-2.0 & CC-BY-SA-4.0"

PV = "15"

RPM_NAME = "wallpapers-openSUSE-extra-15-2.7.noarch.rpm"
RPM_HASH = "b6705bc2fac8a6145ee331004b2ad5f60422dafb19c0431e439d9a34bea0e5853a5447f951b9edee57f1513416d97d4c1dfcef41efd5afb7a005504359b6078f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-wallpapers \
wallpapers-openSUSE-extra"
RDEPENDS:${PN} += ""

inherit rpm
