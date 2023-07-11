SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.45.0"

RPM_NAME = "python39-ogr-0.45.0-1.1.noarch.rpm"
RPM_HASH = "4a500ee293f2e3c8268344552f62262eb834b0b01daead43a3b77071576db24c1b7630abf5ca8a0c10a649e340bef1082360efb1109f2c812af550028d9dbcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ogr \
python39-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-GitPython \
python39-PyGithub \
python39-PyYAML \
python39-cryptography \
python39-python-gitlab \
python39-requests"

inherit rpm
