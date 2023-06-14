SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-recoveryservicessiterecovery-1.0.0.0-2.2.noarch.rpm"
RPM_HASH = "f8a42abf55e07c8d9c37a4e56f2965c622174406f2b84c3076b8815836322cdf57b6e46eca10294d3cea1a9a8e1e8ec01997df24dc3e1664bb669adc15c2ad21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-recoveryservicessiterecovery \
python39-azure-mgmt-recoveryservicessiterecovery \
python3dist-azure-mgmt-recoveryservicessiterecovery"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
