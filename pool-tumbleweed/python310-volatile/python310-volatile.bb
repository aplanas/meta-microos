SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-volatile-2.1.0-1.13.noarch.rpm"
RPM_HASH = "6c030d11e2c15e059d321976553cbbb88e6494d60beeaa7ab05c534564cb408b787a83f5c64b2c6c066b520471b47a0524638251398ba30a2111a552599a21d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-volatile \
python310-volatile \
python3dist-volatile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
