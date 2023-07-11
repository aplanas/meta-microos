SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-http-ece-1.1.0-4.4.noarch.rpm"
RPM_HASH = "2510ba183aac890a862200c36b228d125a8c2756f132c11e07ef1ec1af99437bfc949ad8549d504a4cb1060dcee76cceab6800bd0053f1ba3e78c6a1d28165ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-http-ece \
python310-http-ece \
python3dist-http-ece"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
