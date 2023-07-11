SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python311-sphinxext-opengraph-0.7.5-1.5.noarch.rpm"
RPM_HASH = "bf1de9907da74289d7b2f7c2e9da4d17e4e84424ec09565104ee0d2b2885e01db34cde99ba56f10707ce9e8ce754cebd6900376ef9f52bb9277615b005654254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxext-opengraph \
python3.11dist-sphinxext-opengraph \
python311-sphinxext-opengraph \
python3dist-sphinxext-opengraph"

RDEPENDS:${PN} += "python-abi \
python3-Sphinx"

inherit rpm
