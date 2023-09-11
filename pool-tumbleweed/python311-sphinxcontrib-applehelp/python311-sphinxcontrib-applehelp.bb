SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.7"

RPM_NAME = "python311-sphinxcontrib-applehelp-1.0.7-1.1.noarch.rpm"
RPM_HASH = "e393eca57df7e5923a863ee4741db17299b1c1e6f342fe0d7056f38ef24a902462be795107fbf51764aa7c48d5fcc4d4f2e8abcb0b4a7af7f43d68b0c24d1274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-applehelp \
python3.11dist-sphinxcontrib-applehelp \
python311-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
