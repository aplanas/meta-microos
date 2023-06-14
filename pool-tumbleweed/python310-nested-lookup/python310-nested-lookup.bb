SUMMARY = "Python functions for working with deeply nested documents (lists and dicts)"
DESCRIPTION = "Python functions for working with deeply nested documents (lists and dicts)"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.25"

RPM_NAME = "python310-nested-lookup-0.2.25-1.3.noarch.rpm"
RPM_HASH = "38971f92105a71befbd50c56227ac6f464ed27fd10f177f00eda19a7cd3480eb655959b123916f72ff305554a13b947d45b97adc35c29fc39493444c1796aaa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nested-lookup \
python3.10dist-nested-lookup \
python310-nested-lookup \
python3dist-nested-lookup"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
