SUMMARY = "Widget to show and switch keyboard layout"
DESCRIPTION = "Widget to show and switch keyboard layout."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-layout-xkbswitch-2.1.5-3.3.noarch.rpm"
RPM_HASH = "c752e3251128a2ae1a11f27c3dd77965481cde49a35bca2809de814a2cb4cbdd342dd8a4e1132c17bd3189821b90f27e14bbc1a0b763ffd57224d9af8e3cbe85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-layout-xkbswitch"

RDEPENDS:${PN} += "bumblebee-status \
xkb-switch"

inherit rpm
