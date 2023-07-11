SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "10.4.1"

RPM_NAME = "python39-dropbox-10.4.1-2.10.noarch.rpm"
RPM_HASH = "224c9c29577751c9379940aef40116c505740a719905f596d698bf13dd81d798a534c97f00cf4006a2aa9fee3ecf428974e46028b7774dd8839b77fda19fe56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dropbox \
python39-dropbox \
python3dist-dropbox"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
