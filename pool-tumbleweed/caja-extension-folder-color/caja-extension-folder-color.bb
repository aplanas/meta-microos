SUMMARY = "Caja extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "caja-extension-folder-color-0.0.88-2.8.noarch.rpm"
RPM_HASH = "4ddf247f9f4df20d59d57c378b01aba68d195cbb2834b3fd47187f242ae3b15e45d47bd44a65b778cfafbb68e7ef727e33073233e4781926918199f37559e29d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-folder-color \
folder-color-caja \
python3.10dist(folder-color-caja) \
python3dist(folder-color-caja)"
RDEPENDS:${PN} += "caja \
folder-color-common \
python-caja"

inherit rpm
