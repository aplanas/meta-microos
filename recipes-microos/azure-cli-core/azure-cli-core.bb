SUMMARY = "Microsoft Azure CLI Core Module"
DESCRIPTION = "Microsoft Azure CLI Core Module"
LICENSE = "MIT"

PV = "2.48.1"

RPM_NAME = "azure-cli-core-2.48.1-1.1.noarch.rpm"
RPM_HASH = "34b31a3c872b9263a4c3e0aa33ade34b999e01caf991e7bdb9e43086fd6fd91bcb8b3b25a2ac89faacb2332bb080d24b348a3c1ba731b25adb5cc3e76792f412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-core python3.10dist(azure-cli-core) python3dist(azure-cli-core)"
RDEPENDS:${PN} += "azure-cli-nspkg azure-cli-telemetry python(abi) python3-PyJWT python3-argcomplete python3-azure-mgmt-core python3-azure-nspkg python3-cryptography python3-humanfriendly python3-jmespath python3-knack python3-msal python3-msal-extensions python3-msrestazure python3-packaging python3-paramiko python3-pip python3-pkginfo python3-psutil python3-pyOpenSSL python3-requests python3-wheel"

inherit rpm
