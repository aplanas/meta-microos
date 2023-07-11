SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python311-dparse-0.6.3-1.1.noarch.rpm"
RPM_HASH = "27fd258943e56c3135d0fbef03337d2fbfa295d8d107ed3bcb1eba5efc91474d0a7a0c7b1d7a33f0db9e7a20a56a64c05f6eb5e9579059d4e06d842a19ec0c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dparse \
python3.11dist-dparse \
python311-dparse \
python3dist-dparse"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-packaging"

inherit rpm
