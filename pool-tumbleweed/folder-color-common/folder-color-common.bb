SUMMARY = "Auxiliary files for the folder-color file browser extension"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "folder-color-common-0.0.88-2.9.noarch.rpm"
RPM_HASH = "935d8fba2ca02d92629ad836810fabd9f499f8c8c572aa446c708db3af8cbbc0e143af3302c0cf68ace459dff052fa1f2a0a930a928616a8f5e1b8c640fab194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-common \
python3.11dist-folder-color-common \
python3dist-folder-color-common"

RDEPENDS:${PN} += "gtk3-tools \
gvfs"

inherit rpm
