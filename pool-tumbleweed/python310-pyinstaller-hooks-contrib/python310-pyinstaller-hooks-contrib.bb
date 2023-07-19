SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.5"

RPM_NAME = "python310-pyinstaller-hooks-contrib-2023.5-1.1.noarch.rpm"
RPM_HASH = "c6c548ca64dcda60f271dac450cc2e99932481a82290c5ecdf2ddcf70dac69e24be9b835491706343573eb6dcd202c46ab96926fe52e5d28f59c6519878a98bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyinstaller-hooks-contrib \
python310-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
