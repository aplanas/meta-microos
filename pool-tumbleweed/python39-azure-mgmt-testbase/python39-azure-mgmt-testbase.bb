SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-testbase-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "ed8164d7346c44d850cf6bc312c90b1d02aa2c8adb27a45c3038415b9b259e5d7c60f5c5bf5032ab7e5eae074725ace3d85f6affd76f07cfc553112883bd0d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-testbase) \
python39-azure-mgmt-testbase \
python3dist(azure-mgmt-testbase)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
