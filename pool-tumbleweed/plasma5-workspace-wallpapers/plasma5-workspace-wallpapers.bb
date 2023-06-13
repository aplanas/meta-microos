SUMMARY = "Additional Plasma Wallpapers"
DESCRIPTION = "Additional wallpapers for Plasma Workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-workspace-wallpapers-5.27.5-1.1.noarch.rpm"
RPM_HASH = "3df1b0c32f74f008d0ba20b3609b0950791bfc63e524880c51d45ff46581fa0b4053b57d1182d89be475df37f3dac464fc9358da8ea042b4494e1c5c60c7e867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
