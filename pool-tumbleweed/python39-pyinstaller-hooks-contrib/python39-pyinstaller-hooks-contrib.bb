SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.0"

RPM_NAME = "python39-pyinstaller-hooks-contrib-2023.0-2.2.noarch.rpm"
RPM_HASH = "8f71e32127e739aeeb104ac389421a605e8ee7aab478e5d46485b1ebcf250469bede52551007593c20a53ece11a88b49cb48b8c5acbd0438f86b4e634be3f7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyinstaller-hooks-contrib \
python39-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
