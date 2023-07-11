SUMMARY = "An interactive command line client for Core API"
DESCRIPTION = "An interactive command line client for Core API."
LICENSE = "BSD-2-Clause"

PV = "1.0.9"

RPM_NAME = "python310-coreapi-cli-1.0.9-1.24.noarch.rpm"
RPM_HASH = "e93d05ec6678825c1948f38f290cbcc2814b78e92f591b6496161e39a0a48cb22e12ce44bb2a9b82143e1fd6d606238924cca168b068571898ae51f9cf1d11e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-coreapi-cli \
python310-coreapi-cli \
python3dist-coreapi-cli"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-coreapi \
python310-coreschema \
python310-itypes \
python310-requests \
python310-uritemplate \
update-alternatives"

inherit rpm
