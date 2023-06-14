SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-stack-data-0.6.2-2.1.noarch.rpm"
RPM_HASH = "d1c0909fea63922b8d711c12a7db05794fde77af70f2a62b17abaa020a7c0a9d8512630dc74ad21b94396f8d078efbdae96c96bf5bf7b3eacb1095c5664d0977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stack-data \
python39-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python39-asttokens \
python39-executing \
python39-pure-eval"

inherit rpm
