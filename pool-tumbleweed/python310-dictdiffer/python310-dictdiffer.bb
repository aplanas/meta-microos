SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-dictdiffer-0.9.0-2.6.noarch.rpm"
RPM_HASH = "36febd9d217e1ed037a4adc84842bd1648ac40f0df414dee459d79d8bb9e71958cf6d73e45dcd8d4cea8b22b044b4dacacde3148582cde76f90915881077c580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictdiffer \
python3.10dist-dictdiffer \
python310-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
