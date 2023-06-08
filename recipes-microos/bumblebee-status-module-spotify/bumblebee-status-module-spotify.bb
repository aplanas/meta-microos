SUMMARY = "Widget to display spotify"
DESCRIPTION = "Displays a spotify widget."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-spotify-2.1.5-3.3.noarch.rpm"
RPM_HASH = "52dd804e0c4ee6d238919dd4e920db9ed83f1ead7ae03bd21f22ab3ac934babdf643d6097f1f1e90f2a46a712020c3f86035438af8cc261d8b45fbf6decd473d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-spotify"
RDEPENDS:${PN} += "bumblebee-status python3-dbus-python spotify-easyrpm"

inherit rpm
