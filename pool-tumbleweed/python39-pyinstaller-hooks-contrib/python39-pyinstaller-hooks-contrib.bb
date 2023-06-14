SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.0"

RPM_NAME = "python39-pyinstaller-hooks-contrib-2023.0-1.4.noarch.rpm"
RPM_HASH = "adbc95b8e8441a520d4cc521938c76bae13b19048806b116be0a9880035a31df6fb16ea946ef94e67f0595b10140cddfb39cc521188e124e36d4142c71616c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyinstaller-hooks-contrib \
python39-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
