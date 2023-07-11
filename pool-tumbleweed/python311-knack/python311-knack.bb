SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python311-knack-0.10.1-1.5.noarch.rpm"
RPM_HASH = "ed5977ce66d4002be45b782ff413d20024793110bd789aaac0fcd1648a6c34e9707dd848b92c01d3dc24cec4ac6368d8abb715ac7ff44cdf780b489c02c13b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-knack \
python3.11dist-knack \
python311-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-argcomplete \
python311-jmespath \
python311-pygments \
python311-tabulate"

inherit rpm
