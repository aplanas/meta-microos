SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-dictdiffer-0.9.0-2.8.noarch.rpm"
RPM_HASH = "8639643e9eb13dd8edf5fea9b0e344e91316dfb60d8f1e4ef632fec4f85357ab843344215b453076a5c68a8b1478b125b6f2cc264fe1eaff736421614ad44084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictdiffer \
python3.11dist-dictdiffer \
python311-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
