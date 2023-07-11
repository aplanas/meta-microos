SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python311-msrestazure-0.6.4-2.12.noarch.rpm"
RPM_HASH = "8a7af64f0f5d558a2b89a612e6ea5fab69d582115e10436c72954fe5b70838a7fba7ee4582015cf78b2c3a74755f4758cc63d3abc868d4cd7ee00d892c3f636c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msrestazure \
python3.11dist-msrestazure \
python311-msrestazure \
python3dist-msrestazure"

RDEPENDS:${PN} += "python-abi \
python311-adal \
python311-msrest \
python311-six"

inherit rpm
