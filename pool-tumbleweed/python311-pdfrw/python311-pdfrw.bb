SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-pdfrw-0.4-4.1.noarch.rpm"
RPM_HASH = "9c9f7b3ce2d5696a9479e822422fc1d7fb14d198efd8b170796b58aa42eeda68472f0d59c4d34ba7cd9a0001d24fa04a1bb6b4a10cbed6166cee49248b06c134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfrw \
python3.11dist-pdfrw \
python311-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
