SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-colorlover-0.3.0-1.16.noarch.rpm"
RPM_HASH = "527a0f592c0d10c8567a93e9984d0c6cac96d20da3a8a1b17f10d0f77f392b365ff89a46be35ce27978da0e67ef96eb1ea495ac90fb3fdfb3aeb1d1c6ae5eb13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorlover \
python39-colorlover \
python3dist-colorlover"

RDEPENDS:${PN} += "python-abi"

inherit rpm
