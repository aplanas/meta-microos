SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-powerbiembedded-2.0.0-4.11.noarch.rpm"
RPM_HASH = "ed1b78ce8d92dbd5b4aa706ad93417eda6774713de722e477277e4615a0dbe0d94d48b99e1f4782d4a35a1fece972abd4c10cebc6445eb30933bc50d320bb503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerbiembedded \
python3.10dist(azure-mgmt-powerbiembedded) \
python310-azure-mgmt-powerbiembedded \
python3dist(azure-mgmt-powerbiembedded)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
