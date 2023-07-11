SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-pyvdr-0.3.1-1.10.noarch.rpm"
RPM_HASH = "f65c0287581d8fb61c290e24308448fd627a61b22067576641713ad53b9e5525b487768a8e0b494f93bda40a48424f7f6977e9ed08e1777d1d94ba79011f121b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvdr \
python3.11dist-pyvdr \
python311-pyvdr \
python3dist-pyvdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
