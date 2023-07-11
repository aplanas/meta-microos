SUMMARY = "Generate and change color-schemes on the fly"
DESCRIPTION = "Generate and change color-schemes on the fly"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-pywal-3.3.0-1.14.noarch.rpm"
RPM_HASH = "5f2b838787c70090cbf865e583d0dabb5c02e67bdb5696821a578dad45b787c7f5ec22aa490fae614bbf84fcae06a668414c645e3ddc13cb2bb98a0941b0f88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywal \
python39-pywal \
python3dist-pywal"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
