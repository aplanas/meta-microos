SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python39-sphinxcontrib-jquery-4.1-2.1.noarch.rpm"
RPM_HASH = "28151f21d467867964790f17402477432c4d2fbf4fd2806d0968d61f7780fc4fdcc9f87a0e7d45ba2f43bcdb844b48bf75bff2cf21b870c48fc6d324e8d8610c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-jquery \
python39-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
