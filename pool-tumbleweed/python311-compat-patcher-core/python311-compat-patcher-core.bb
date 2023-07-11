SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python311-compat-patcher-core-2.1-1.4.noarch.rpm"
RPM_HASH = "575cf5991d55a24442454eaa7436c159d6a90f73478785dfedc2a5ffdeddc3322d8a80153bc380e2c45ed6dc099a2ad0487a5fa5d9a58c0c3fbc8022c6a68078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compat-patcher-core \
python3.11dist-compat-patcher-core \
python311-compat-patcher-core \
python3dist-compat-patcher-core"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
