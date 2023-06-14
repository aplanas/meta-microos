SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-dataprotection-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "70c34e4dc90cf96caaec6e1d039c2f7641efc367bedf72db58c8b67fe86f700d92886249d9d129567e3e6ab7654934a90c458d99206e813616f7ae58412c9510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dataprotection \
python3.10dist-azure-mgmt-dataprotection \
python310-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
