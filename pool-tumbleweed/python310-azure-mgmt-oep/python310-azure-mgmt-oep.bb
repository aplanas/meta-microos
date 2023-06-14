SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-oep-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "bc8e4a7b8a1aa8036e5da7b0d70b7956289b64406dda68661126a9c25bdef96a13106c5eb3bc5b2ab26c71a6ec590e48f15cb6fee88764ad802490fe5d940b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-oep \
python3.10dist-azure-mgmt-oep \
python310-azure-mgmt-oep \
python3dist-azure-mgmt-oep"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
