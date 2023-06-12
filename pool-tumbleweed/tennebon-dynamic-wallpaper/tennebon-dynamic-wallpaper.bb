SUMMARY = "Tennebon Dynamic wallpaper for GNOME"
DESCRIPTION = "This package contains a dynamic wallpaper based on the Tennebon wallpaper. \
 \
A dynamic wallpaper changes depending on the time of the day: it is \
generally bright during the day, and dark during the night."
LICENSE = "CC-BY-SA-2.5"

PV = "1"

RPM_NAME = "tennebon-dynamic-wallpaper-1-13.16.noarch.rpm"
RPM_HASH = "f034d19592d78ff946c85cee72d84698d75cd87f4e12c8f9cb77dec06dec0d52ae6c29648559eb9162337432379110a717102704283646519eddf3d606e893fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tennebon-dynamic-wallpaper"
RDEPENDS:${PN} += ""

inherit rpm
