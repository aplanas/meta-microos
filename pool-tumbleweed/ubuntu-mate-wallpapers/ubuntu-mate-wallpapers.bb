SUMMARY = "Wallpaper and background images from Ubuntu MATE"
DESCRIPTION = "The default Ubuntu MATE wallpapers for the Ubuntu MATE releases."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "ubuntu-mate-wallpapers-22.04.17-1.4.noarch.rpm"
RPM_HASH = "3492137685b3c9eb40ef7e4d92649b64c7bd492a2b735dc767c522b021ef2016921324bc166af84a2be673c8eb201dc0acd75c5cd9969a830ccbba472e7b9c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-mate-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
