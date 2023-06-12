SUMMARY = "Microsoft Azure CLI Core Module"
DESCRIPTION = "Microsoft Azure CLI Core Module"
LICENSE = "MIT"

PV = "2.49.0"

RPM_NAME = "azure-cli-core-2.49.0-1.1.noarch.rpm"
RPM_HASH = "176c7eab1352692696935ed4168d71569f33b69b336362ca9edf132d725ae67548979ee633318919379f6a3661c24bf119116cc52368bad980e300708289a858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-core \
python3.10dist(azure-cli-core) \
python3dist(azure-cli-core)"
RDEPENDS:${PN} += "azure-cli-nspkg \
azure-cli-telemetry \
python(abi) \
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
