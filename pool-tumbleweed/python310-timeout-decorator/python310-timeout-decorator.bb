SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-timeout-decorator-0.5.0-1.3.noarch.rpm"
RPM_HASH = "9b8d93bedbe5fb09624105d3a37a6e77d1ff13f22a5a143d97674971b668acc9359bcedbfa14b0d2ae427db74921d5a81ef4dab982bc3560b7f1217fdc1b9187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-timeout-decorator \
python310-timeout-decorator \
python3dist-timeout-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
