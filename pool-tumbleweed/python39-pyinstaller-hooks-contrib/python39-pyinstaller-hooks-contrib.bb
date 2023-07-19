SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.5"

RPM_NAME = "python39-pyinstaller-hooks-contrib-2023.5-1.1.noarch.rpm"
RPM_HASH = "fb28c7b9877afc06d1a106fe14280dd5edbc2209541059e5022fae64ab4243a0f0268b7fe920273a143d88fb2f48971ae1ec294ad7a716e9da5f0664112ce3c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyinstaller-hooks-contrib \
python39-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
