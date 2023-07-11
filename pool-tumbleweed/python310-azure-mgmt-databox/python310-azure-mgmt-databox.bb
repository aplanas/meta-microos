SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-databox-2.0.0-1.2.noarch.rpm"
RPM_HASH = "19638b9099a5f3e748aa6ea440e22f8322e96abe1acbf718f38839ac64f8758e4030dcc36f32263a7b8a462d123a4df6d0020c412ce09c1e3fc6205da8646678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-databox \
python310-azure-mgmt-databox \
python3dist-azure-mgmt-databox"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
