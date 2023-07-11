SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python311-azure-common-1.1.28-1.7.noarch.rpm"
RPM_HASH = "958ef73a27d9dd2fc59c83644aacfc85d12bcb6f0507e4063b9636871134df3d8ca9d73c729d409946132fd3779fe0de8e8fa071a07ad3e25e613ece95b3758b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-common \
python3.11dist-azure-common \
python311-azure-common \
python3dist-azure-common"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
