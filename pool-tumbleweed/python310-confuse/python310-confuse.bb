SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-confuse-2.0.1-1.3.noarch.rpm"
RPM_HASH = "af378574759bc5e1ae5a825b838f53b00d81da11032aad5bff4d1e29a2f7111d39b378b42c22c8ee6bbdea60fba58769f6b703001bb6a6152ffee7280f5e6366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-confuse \
python310-confuse \
python3dist-confuse"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
