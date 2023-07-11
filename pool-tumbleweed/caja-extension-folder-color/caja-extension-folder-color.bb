SUMMARY = "Caja extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "caja-extension-folder-color-0.0.88-2.9.noarch.rpm"
RPM_HASH = "bda73e64b0f0f870eac8bd9beab62aede2e3945f00d5be14ceb0cb49ff461fa3ae7cc67cf9c46391c0a164df53fa8ef1faa1739543504ea785c32da3db5b78ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-folder-color \
folder-color-caja \
python3.11dist-folder-color-caja \
python3dist-folder-color-caja"

RDEPENDS:${PN} += "caja \
folder-color-common \
python-caja"

inherit rpm
