SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-mando-0.7.1-1.6.noarch.rpm"
RPM_HASH = "38cb0045eedf794584f69d6a970725ad67bc5dd23436acb3dac5a80e0f60a65fb537cc57668e165846aef17f3e6bf68800dfa844122a90c68ea701cf575f2058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mando) \
python311-mando \
python3dist(mando)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
