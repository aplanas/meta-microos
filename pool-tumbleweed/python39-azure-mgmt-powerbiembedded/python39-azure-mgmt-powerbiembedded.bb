SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-powerbiembedded-2.0.0-4.12.noarch.rpm"
RPM_HASH = "48b4c53abfad9a342923b25e237bd9e57c0a52ee2ce1628b3fd5b1af4d316166667bdfc92556a7596a52047981fdfdfd43af504ffa8c3d736103c55fcb93be5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-powerbiembedded \
python39-azure-mgmt-powerbiembedded \
python3dist-azure-mgmt-powerbiembedded"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
