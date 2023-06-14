SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-installer-0.7.0-2.1.noarch.rpm"
RPM_HASH = "b993f20cce3261211cadc23cb6ceebba9cf392dcb43d596fb09f8d2a04c823a7de6af1dd8ddc59266d03a804ed5ce7b64d24da8e954a074f4425fe8c053b75a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-installer \
python39-installer \
python3dist-installer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
