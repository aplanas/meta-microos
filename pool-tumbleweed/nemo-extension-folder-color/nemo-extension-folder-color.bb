SUMMARY = "Nemo extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "nemo-extension-folder-color-0.0.88-2.9.noarch.rpm"
RPM_HASH = "ed94eb7dd5cb9aeed949e981d5396a670dcf15879a40aec24cd2abccb6e07e973d217b5cd558aeb6d80fd66b55a9ff4ec6d44d66f1d7dc02dc0f43a0e219d330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-folder-color \
python3.11dist-folder-color-nemo \
python3dist-folder-color-nemo"

RDEPENDS:${PN} += "folder-color-common \
nemo \
python-nemo"

inherit rpm
