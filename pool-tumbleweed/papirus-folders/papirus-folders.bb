SUMMARY = "Change folders color of Papirus icon theme"
DESCRIPTION = "Papirus Folders is a command-line utility that allows changing the color of folders in Papirus icon theme. \
Type 'papirus-folders --help' to see all options available."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "papirus-folders-1.12.1-1.1.noarch.rpm"
RPM_HASH = "e322c687f70fe46efa5a065465afb234eb4ae3cfe7e4f8ae249726ac28aa8cdeb41c8012ab9911a10f28f368f7082128f97b0f49d2edee3d3cc38a67e3b9d7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papirus-folders"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
papirus-icon-theme"

inherit rpm
