SUMMARY = "Nemo extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "nemo-extension-folder-color-0.0.88-2.8.noarch.rpm"
RPM_HASH = "d88ba89b745a362ca239f543b97dbb6a34661be19857b692ef7b2d61fff59cdda40e2b5b48c627ef2997024cc35864d5e7065df388430009e1ef7c1bf86c2d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-folder-color \
python3.10dist(folder-color-nemo) \
python3dist(folder-color-nemo)"
RDEPENDS:${PN} += "folder-color-common \
nemo \
python-nemo"

inherit rpm
