SUMMARY = "Microsoft Azure CLI Core Module"
DESCRIPTION = "Microsoft Azure CLI Core Module"
LICENSE = "MIT"

PV = "2.49.0"

RPM_NAME = "azure-cli-core-2.49.0-1.2.noarch.rpm"
RPM_HASH = "92a3a73906c6f275be13a18b929d50daf1ecdaee9c52da70c7cfd06d0f5639078eb70fa2b4a5442669699d74d6d31af6a6231b6f543fdd458ec2d7d1e4c400c8"
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
