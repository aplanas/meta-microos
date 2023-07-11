SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python310-click-option-group-0.5.6-1.1.noarch.rpm"
RPM_HASH = "b35e57df0738264f1ddc15c6f0194a4d6fa6f7c41f750f3b5ee3250d9490c71e735839264a9c6cdb627db080fd167355dbb282363c22bbdf0b31a74598932374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-option-group \
python310-click-option-group \
python3dist-click-option-group"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
