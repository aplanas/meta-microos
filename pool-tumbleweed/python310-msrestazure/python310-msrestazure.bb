SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python310-msrestazure-0.6.4-2.11.noarch.rpm"
RPM_HASH = "79b690aa4863c1f2a587e134703a0132fa048abf763022bab30eb5a10453d942a2c3684d59a904a856bbca71a365f70f22d6853ddc4d6d2b634ef16f6b4e8c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msrestazure \
python3.10dist-msrestazure \
python310-msrestazure \
python3dist-msrestazure"

RDEPENDS:${PN} += "python-abi \
python310-adal \
python310-msrest \
python310-six"

inherit rpm
