SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b1"

RPM_NAME = "python310-azure-mgmt-servicelinker-1.2.0~b1-1.4.noarch.rpm"
RPM_HASH = "e4dc60f06181f40dac9b5069a40011e002f901ca35dc8ea12f5aef8f51d529b82011c6085a07eb867b5724b4b094779c2aa99669283ec84041e29b20d9a6a3e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-servicelinker \
python310-azure-mgmt-servicelinker \
python3dist-azure-mgmt-servicelinker"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
