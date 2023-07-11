SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-pdfrw-0.4-3.17.noarch.rpm"
RPM_HASH = "abebe50557f69cbcc6de009ea34c5c19e72e8de98ffe60e61825c9520e607ffe5f5f58ebef27a26e1f0b3d7b6b3f34df58697379dd857a0c54995bbffa1d72b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdfrw \
python310-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
