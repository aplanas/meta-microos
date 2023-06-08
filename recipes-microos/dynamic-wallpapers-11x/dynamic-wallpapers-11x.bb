SUMMARY = "Dynamic wallpapers for GNOME, from previous versions of openSUSE"
DESCRIPTION = "This package contains dynamic wallpapers from previous versions of \
openSUSE. \
 \
A dynamic wallpaper changes depending on the time of the day: it is \
generally bright during the day, and dark during the night."
LICENSE = "GPL-3.0 & CC-BY-SA-2.5"

PV = "11.4"

RPM_NAME = "dynamic-wallpapers-11x-11.4-13.16.noarch.rpm"
RPM_HASH = "61bf20db957b79c5168067b4ab5e2cf8ba81349c7331af78ad3a51c31cfa5a3538ec03437cf94294b201cacd197dfdc6d2527320f140cc333ddf239420876de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynamic-wallpapers-11x openSUSE-dynamic-wallpapers-old"
RDEPENDS:${PN} += ""

inherit rpm
