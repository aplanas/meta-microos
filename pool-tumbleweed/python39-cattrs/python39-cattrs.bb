SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python39-cattrs-22.2.0-2.1.noarch.rpm"
RPM_HASH = "159fa98dfa82513248acb34a59c80b0f3d03dd8f66cf32aace85ca75432b85c6bd060953f76746831958bb69764d34c24628b6143eee39bd44e15a0c13d6934d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cattrs \
python39-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
