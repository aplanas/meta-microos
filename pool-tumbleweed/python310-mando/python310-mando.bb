SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-mando-0.7.1-2.3.noarch.rpm"
RPM_HASH = "152ee5134f166882a3c587b4038988398c56550d38cbe70172de7f476bd574720ac8b28f621037d30f5d090a279ff4b1b8dc405f323587065c9ddd0b80d03067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mando \
python310-mando \
python3dist-mando"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
