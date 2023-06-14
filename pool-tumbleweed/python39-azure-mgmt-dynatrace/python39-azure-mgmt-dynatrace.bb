SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-dynatrace-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "43edce86b94aa34cb8a21bc706afcb991e87e3af399224849711160c3b1f0fbebe5fe7860180204fee84c9f0ad00e0829960515ac19ced5e887785f1e2f65285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dynatrace \
python39-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
