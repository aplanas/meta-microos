SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python39-azure-mgmt-chaos-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "11ecba01f5536daa75c96e3c907eef9247741a4e6eb461000c11dac5167cb7a8edafc84c3ea18d1d5244db841431243297cda49dce9b0dd03c59a6b272d8d06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-chaos \
python39-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
