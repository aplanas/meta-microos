SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python310-netutils-1.4.1-1.3.noarch.rpm"
RPM_HASH = "15ab269ebfa92ac1cfacb853aa11505d24b02dc6b275451445c78ec64cd5e8833b4d6f783edb9896451f6df911b4906de91b8454a6b131b1a545c2db8daed243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-netutils \
python310-netutils \
python3dist-netutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
