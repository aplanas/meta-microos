SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-subprocrunner-2.0.0-2.3.noarch.rpm"
RPM_HASH = "84bb4646dedd02cc11da3ab6ae1e3cc66c2a7f59b6e71a17daa2432f270cb58a186856b1996125990fd3fe52dc543d85d05fa59ce7a48aefb20bc84e7ee02f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocrunner \
python3.10dist-subprocrunner \
python310-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python310-loguru \
python310-mbstrdecoder \
python310-typepy"

inherit rpm
