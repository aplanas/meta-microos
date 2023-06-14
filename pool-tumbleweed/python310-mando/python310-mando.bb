SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-mando-0.7.1-1.6.noarch.rpm"
RPM_HASH = "1257f03ea2cc1fb4e99e4b8cebfbdcef7e7daa6219df374dfe3f458609e2c74c72246423d76536c1054813f7a5235901cfe4f5573b39a38568c98d93599ebbe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mando \
python3.10dist-mando \
python310-mando \
python3dist-mando"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
