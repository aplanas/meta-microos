SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.0"

RPM_NAME = "python311-pyinstaller-hooks-contrib-2023.0-2.2.noarch.rpm"
RPM_HASH = "4062d3557e5104bd0aa7f9237d0824756dcb9016d33c7070f309986681c67ff9739cbad9774f7482d5f02c519c386d20d5324bb443524429ff2eceddd5b6697e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyinstaller-hooks-contrib \
python3.11dist-pyinstaller-hooks-contrib \
python311-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
