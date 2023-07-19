SUMMARY = "Microsoft Azure CLI Core Module"
DESCRIPTION = "Microsoft Azure CLI Core Module"
LICENSE = "MIT"

PV = "2.50.0"

RPM_NAME = "azure-cli-core-2.50.0-1.1.noarch.rpm"
RPM_HASH = "90ad09f58a562dc7209431832e1d6ec5db9f540ec0570154c27c2ac3ec9f06fc4710c58eeb08f61906f1894d6fe0a0bfd8ac824e0b48cf01b42a8884cffa0935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-core \
python3.11dist-azure-cli-core \
python3dist-azure-cli-core"

RDEPENDS:${PN} += "azure-cli-nspkg \
azure-cli-telemetry \
python-abi \
python3-PyJWT \
python3-argcomplete \
python3-azure-mgmt-core \
python3-azure-nspkg \
python3-cryptography \
python3-humanfriendly \
python3-jmespath \
python3-knack \
python3-msal \
python3-msal-extensions \
python3-msrestazure \
python3-packaging \
python3-paramiko \
python3-pip \
python3-pkginfo \
python3-psutil \
python3-pyOpenSSL \
python3-requests \
python3-wheel"

inherit rpm
