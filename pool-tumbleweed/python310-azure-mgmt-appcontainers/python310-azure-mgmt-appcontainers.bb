SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-appcontainers-2.0.0-1.2.noarch.rpm"
RPM_HASH = "6f9174835d032a743fecdfe42f44845f9e07321c50e2006aef5f3f3e3e3d5c2879a1f3ffca9be3e99bebc7b7b0e0543672cb89bbe1819fd5dc34b634e50d6d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcontainers \
python3.10dist(azure-mgmt-appcontainers) \
python310-azure-mgmt-appcontainers \
python3dist(azure-mgmt-appcontainers)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
