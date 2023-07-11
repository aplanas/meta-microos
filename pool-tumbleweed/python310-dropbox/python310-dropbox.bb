SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "10.4.1"

RPM_NAME = "python310-dropbox-10.4.1-2.10.noarch.rpm"
RPM_HASH = "97053b0bc9ca50984cd2d0f6d21e346b78b01ebacf6e69c64ffc12c476fcda1f5593a3d9f72eb66b052f04294acd2b4c5df5912ee89ca42916b7cb01014fb1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dropbox \
python310-dropbox \
python3dist-dropbox"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
