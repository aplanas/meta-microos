SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-webpubsub-1.1.0-1.2.noarch.rpm"
RPM_HASH = "fd1570db0140c463506af2978ea6a7c38328a6f9b3a905bcc5db557c2f2c7b164b58297347668b6068d92ffcdaaeaeed1d5e8eea05149cd534079e0c8557908f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-webpubsub \
python3.10dist-azure-mgmt-webpubsub \
python310-azure-mgmt-webpubsub \
python3dist-azure-mgmt-webpubsub"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
