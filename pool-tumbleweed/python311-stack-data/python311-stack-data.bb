SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-stack-data-0.6.2-4.1.noarch.rpm"
RPM_HASH = "64e0285443e1db3c74da580bc1ea9b5f83b2a4311efa66b288ce8f3cd146bf2a4aa50da2eccab2a3c5ae67bbc120bd4eefd17e63912b04b150090d733c4e91bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stack-data \
python3.11dist-stack-data \
python311-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python311-asttokens \
python311-executing \
python311-pure-eval"

inherit rpm
