SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-voiceservices-1.0.0-1.2.noarch.rpm"
RPM_HASH = "b65224be9cf2b96725e0e26eab4500b59a580ec03d218daa4f82d533334ee4c024c5824d43af03d4881557a4e2c47fe667325d70a9da199b64fd74ea0af953d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-voiceservices \
python3.11dist-azure-mgmt-voiceservices \
python311-azure-mgmt-voiceservices \
python3dist-azure-mgmt-voiceservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
