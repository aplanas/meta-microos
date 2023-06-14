SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python39-azure-mgmt-chaos-1.0.0b6-1.3.noarch.rpm"
RPM_HASH = "3b83b7bedeb467b292a27dd004c5491a8676c808af0aad3e41ac2420d0e1a1878cdf80707e693a1205a2dc12a9531ce2da490d96240acfe4c66a457a99f443ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-chaos \
python39-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
