SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-azure-mgmt-avs-7.1.0-1.4.noarch.rpm"
RPM_HASH = "9ee151b15dc3e551bab8af0b6a31e33bbf123f1dacd452ddcc056b7cb5bc57d49ac8eb4f884efafa21200990cff4f8795dff476efd235720f3bbf52bfc479ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-avs \
python39-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
