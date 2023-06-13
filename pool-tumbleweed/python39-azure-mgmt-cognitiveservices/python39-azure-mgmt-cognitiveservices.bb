SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.4.0"

RPM_NAME = "python39-azure-mgmt-cognitiveservices-13.4.0-1.3.noarch.rpm"
RPM_HASH = "f50ee9fdf3cec0a7417967be36a353b5bba41934ef4ceffee6beb9d3275cfae421a9833f020addc7a81f819513816c6bca376dbc88ac87f8a46cee86c79fb593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-cognitiveservices) \
python39-azure-mgmt-cognitiveservices \
python3dist(azure-mgmt-cognitiveservices)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
