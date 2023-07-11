SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python311-sphinxcontrib-jsmath-1.0.1-4.2.noarch.rpm"
RPM_HASH = "4deed571a397953067e1db59b616ed02f026d9bca1b944bc4cb70c00866694d94a843f783896ed12892c254889aad3dfe2256e9af7e5b4b56013e6da08240b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jsmath \
python3.11dist-sphinxcontrib-jsmath \
python311-sphinxcontrib-jsmath \
python3dist-sphinxcontrib-jsmath"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
