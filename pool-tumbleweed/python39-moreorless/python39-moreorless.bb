SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-moreorless-0.4.0-1.5.noarch.rpm"
RPM_HASH = "5a4a616fec813858d2484cc580b23da6955381c787ef4b5f92ea3c13dca7a2dc535c021d8baa4d6d17735b5b1545a04fbac4d77f1c8e6fec9eb815fb0d1f0e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moreorless \
python39-moreorless \
python3dist-moreorless"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-volatile"

inherit rpm
