SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python310-msrestazure-0.6.4-2.12.noarch.rpm"
RPM_HASH = "d3fc79bb29fd3542db72a365d62cb6d77dfa160301f5b8a2700c8834299f60d6a88603f6fccf2058d36c1426b96f6befe1cc1f321eab9a671e1d5fbef445594e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msrestazure \
python310-msrestazure \
python3dist-msrestazure"

RDEPENDS:${PN} += "python-abi \
python310-adal \
python310-msrest \
python310-six"

inherit rpm
