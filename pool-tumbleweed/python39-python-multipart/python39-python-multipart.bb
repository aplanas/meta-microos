SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python39-python-multipart-0.0.5-6.1.noarch.rpm"
RPM_HASH = "21915d656340b840f1445a3eb77561d17cb4589cf77a6b87b9de1bf2c3b09987fb828094b50ec7db147b003a875c133d3459f4f1ef7c155eb8b6d4d60b914771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-multipart \
python39-python-multipart \
python3dist-python-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
