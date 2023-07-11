SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-perky-0.5.5-1.5.noarch.rpm"
RPM_HASH = "50dd3134b01bcfd757cf863aff8481b172313b0c2c4b84f6c0fdb064dcdd1a49fbac0a1faa000c674a01eb081e9f19c8f24365e258f1f90a3719752b534dd879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-perky \
python310-perky \
python3dist-perky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
