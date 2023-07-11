SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python310-python-multipart-0.0.5-6.1.noarch.rpm"
RPM_HASH = "f0b6dd84154d799591ee8199ed925874af740b559950d8327bf249820a29fae931c1c35f98c5a9bf01cde5a8f3bfe458715ed8a7f5431139ce9c2b9f35abe8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-multipart \
python310-python-multipart \
python3dist-python-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
