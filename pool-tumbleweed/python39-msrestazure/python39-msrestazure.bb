SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python39-msrestazure-0.6.4-2.12.noarch.rpm"
RPM_HASH = "7610fbe7bd29d2ac7fa4e8bbedb484ba436402179bbf6aa06fa60523e0d97e9a487985600a14719fb083d0507edd2fba58bf97917eccef39661703433ecdc007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msrestazure \
python39-msrestazure \
python3dist-msrestazure"

RDEPENDS:${PN} += "python-abi \
python39-adal \
python39-msrest \
python39-six"

inherit rpm
