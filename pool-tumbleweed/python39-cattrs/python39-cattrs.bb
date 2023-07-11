SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python39-cattrs-22.2.0-2.3.noarch.rpm"
RPM_HASH = "964591f5d608e6ada0b2679c9b7f02d81d8ffa058a0c83e250799f0b429e065ea91f50d32b11aa461e206163a0ec699d4acba457748beb9d5f790275eb509233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cattrs \
python39-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
