SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.5"

RPM_NAME = "python311-pyinstaller-hooks-contrib-2023.5-1.1.noarch.rpm"
RPM_HASH = "6c4e771fd982898f7be7232ca81e213e755e9f3f4d5f4e0bdb1909ee2f59535abd44075ed7a81f3aeab4d1dfff9db9fe024669a9ef650aa5b7f4092650b423ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyinstaller-hooks-contrib \
python3.11dist-pyinstaller-hooks-contrib \
python311-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
