SUMMARY = "Displays HDD smart status"
DESCRIPTION = "Displays HDD smart status of different drives or all drives."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-smartstatus-2.1.5-3.3.noarch.rpm"
RPM_HASH = "b503ef4a9f55f4a97e271baab6a0995695c9ff4ee8ff94c9e4a0354f70de98bec34973d2e9a5e039eb059dc0c648bb6c46725166f1ca50d5923b3225cbed8a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-smartstatus"

RDEPENDS:${PN} += "bumblebee-status \
smartmontools"

inherit rpm
