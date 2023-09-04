SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-pdfrw-0.4-4.1.noarch.rpm"
RPM_HASH = "daaae707eb355975dc80b28fe871ad8992d214340b31fdb28c5b89737f0d2bd1a4aadc0c6f316e44b7602e318a13ceb48668629ee0a90f5745f90d6731e62b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdfrw \
python310-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
