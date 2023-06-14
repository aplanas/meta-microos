SUMMARY = "Microsoft Azure Confluent Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confluent Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-confluent-1.0.0.0-1.10.noarch.rpm"
RPM_HASH = "a9ffb2f4cee3431d87260af1c9dc883d4bbc3682fd27d24cdf66023ad04dc56936c70a9c4f517cbedebae34275f0bff13cf0d69cd17bf3f762a057c2ac2453a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-confluent \
python311-azure-mgmt-confluent \
python3dist-azure-mgmt-confluent"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
