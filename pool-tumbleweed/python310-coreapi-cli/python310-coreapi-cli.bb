SUMMARY = "An interactive command line client for Core API"
DESCRIPTION = "An interactive command line client for Core API."
LICENSE = "BSD-2-Clause"

PV = "1.0.9"

RPM_NAME = "python310-coreapi-cli-1.0.9-1.22.noarch.rpm"
RPM_HASH = "491345f5e1458030ddcbd52c51a3eefbb03146a22da639f899891c0466db36032c00bcf9d72ec88d9d42e0349d9b5c97c1c9136c5ee15be8585bd7b563820eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coreapi-cli \
python3.10dist(coreapi-cli) \
python310-coreapi-cli \
python3dist(coreapi-cli)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-coreapi \
python310-coreschema \
python310-itypes \
python310-requests \
python310-uritemplate \
update-alternatives"

inherit rpm
