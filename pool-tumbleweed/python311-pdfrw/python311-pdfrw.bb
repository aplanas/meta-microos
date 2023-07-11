SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-pdfrw-0.4-3.17.noarch.rpm"
RPM_HASH = "e910b8016d81c811bf6ee088bd77590991278a1500d9694ce933e8609b5db4cfa0677fe2be49013d115030e47c1063fd7b48b20f12cd34c4e95be6a909e6335d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfrw \
python3.11dist-pdfrw \
python311-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
