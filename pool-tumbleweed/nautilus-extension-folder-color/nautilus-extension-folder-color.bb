SUMMARY = "Nautilus extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "nautilus-extension-folder-color-0.0.88-2.9.noarch.rpm"
RPM_HASH = "d1feadc7adafb4cf630b995558335241f464d5c9f6444e6cbed7924b61b8f5ebf085307492e62eef7a781580df90592411e16b1aad70bad70df9a4ab2ef91401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-nautilus \
nautilus-extension-folder-color \
python3.11dist-folder-color-nautilus \
python3dist-folder-color-nautilus"

RDEPENDS:${PN} += "folder-color-common \
nautilus \
python3-nautilus"

inherit rpm
