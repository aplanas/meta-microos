SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-stack-data-0.6.2-2.3.noarch.rpm"
RPM_HASH = "7b398ef5d883f3627e8cb49b9ff8a75f30fd7751e827824599ba797b7a9e1ff66d9bc2702db691faa0ee9a6848a2e1f75105bed464606dc8b7630a75461ca00b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stack-data \
python310-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python310-asttokens \
python310-executing \
python310-pure-eval"

inherit rpm
