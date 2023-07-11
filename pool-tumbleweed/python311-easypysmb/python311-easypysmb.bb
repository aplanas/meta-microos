SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python311-easypysmb-1.4.4-1.13.noarch.rpm"
RPM_HASH = "8701c2894b7dd362ef067112f81f8c62553af638d4f5a6f3c155aa5a594473a0b648d6bca9b284e991ad45973d9a3e674ea4fc132822f1fb358de00bc20be64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easypysmb \
python3.11dist-easypysmb \
python311-easypysmb \
python3dist-easypysmb"

RDEPENDS:${PN} += "python-abi \
python311-pysmb"

inherit rpm
