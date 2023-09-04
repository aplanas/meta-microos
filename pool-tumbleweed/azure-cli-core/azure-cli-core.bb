SUMMARY = "Microsoft Azure CLI Core Module"
DESCRIPTION = "Microsoft Azure CLI Core Module"
LICENSE = "MIT"

PV = "2.51.0"

RPM_NAME = "azure-cli-core-2.51.0-1.1.noarch.rpm"
RPM_HASH = "06f57420d8add27664c5bc31b947b11a30ddd416a98c0b3358a2f9c1b700b5b448711982a2c5b6b3cd3a9d17ea0aee375246ca981618fa8b28d068a5527f88fa"
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
