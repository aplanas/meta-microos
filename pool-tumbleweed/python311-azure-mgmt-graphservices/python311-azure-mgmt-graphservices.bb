SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-graphservices-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "8711b6192e90350584e7ada82caf5c584fbd7fc8215aec2f9b0c952e6d1d6db01bcd40dcaa5ceae16e0e7120d2a27021b698c2ca839ac23b45c7b4ce482ecfdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-graphservices) \
python311-azure-mgmt-graphservices \
python3dist(azure-mgmt-graphservices)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
