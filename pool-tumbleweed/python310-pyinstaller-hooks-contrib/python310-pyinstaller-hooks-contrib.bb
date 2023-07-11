SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.0"

RPM_NAME = "python310-pyinstaller-hooks-contrib-2023.0-2.2.noarch.rpm"
RPM_HASH = "160b74195099e9e7870c2c29179852c689d30ed2f48dcacaf9b236b131409f246c05fe2e19e02ddf656f4faa1963485e91e9a615f87b71fdf8a671351cceda24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyinstaller-hooks-contrib \
python310-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
