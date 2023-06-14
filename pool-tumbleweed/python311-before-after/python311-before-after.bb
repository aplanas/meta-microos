SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python311-before-after-1.0.1-2.6.noarch.rpm"
RPM_HASH = "3760575bfed6158e90334d48f211740f0d8e3996fc8a353b9ee9ccfc6d2cb110f42db2c07da130817424f15706f0273c983a6314d9a88775beed6c1e01ba3d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-before-after \
python311-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
