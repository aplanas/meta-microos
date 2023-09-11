SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python311-sphinxcontrib-jquery-4.1-2.1.noarch.rpm"
RPM_HASH = "ce381ba841e24da37a8aa0aab7787c4e9489e2e27b5d6469145708f19441cbc3d06a85784a536afdc925cd1e5c506a47366970369b32646ac042680e5dee5492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jquery \
python3.11dist-sphinxcontrib-jquery \
python311-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
