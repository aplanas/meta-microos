SUMMARY = "GTK+ 2 support for the Adwaita GNOME theme"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gtk2-metatheme-adwaita-3.28-1.20.noarch.rpm"
RPM_HASH = "ea1e5ea4c2bd8779e205151cddbabf0b22762f03619919aceab52edbd49105bf1584c1c161945cbe6a0ec9a5fdabb2c9b9edb891f7b3605469a5be4185478a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-adwaita"
RDEPENDS:${PN} += "gtk2 \
gtk2-theming-engine-adwaita \
metatheme-adwaita-common"

inherit rpm
