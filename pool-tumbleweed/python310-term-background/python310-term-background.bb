SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python310-term-background-1.0.1-1.6.noarch.rpm"
RPM_HASH = "f738278e4cd8abb0ee78dbc2d6efa0233d4b13b0b0923a0470fdd353a03e392b3a35af4486e7dffc01912336fa440a956b1f7fae9efe64a1a74399285368b15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-term-background \
python3.10dist-term-background \
python310-term-background \
python3dist-term-background"

RDEPENDS:${PN} += "python-abi"

inherit rpm
