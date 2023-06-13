SUMMARY = "Auxiliary files for the folder-color file browser extension"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "folder-color-common-0.0.88-2.8.noarch.rpm"
RPM_HASH = "0763993b331ee34e227c1b4686358a71a654d682165cad78bc2da1ac7342fdb867b6d90a32b3211a9ea43f4364491f2e2e1ddf1b0c4577df6a0a0308a77bfc59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-common \
python3.10dist(folder-color-common) \
python3dist(folder-color-common)"

RDEPENDS:${PN} += "gtk3-tools \
gvfs"

inherit rpm
