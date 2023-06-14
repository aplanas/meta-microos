SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python310-cattrs-22.2.0-2.1.noarch.rpm"
RPM_HASH = "a97b381d677f95de1dc0fd29e6ff7d5fc306056e8f82dc9b5bbeaf903573d74f6e8264ddaa3ae94c8c0872418c026932b6d49e250f4fe6f67d28cd598633d0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cattrs \
python3.10dist-cattrs \
python310-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
