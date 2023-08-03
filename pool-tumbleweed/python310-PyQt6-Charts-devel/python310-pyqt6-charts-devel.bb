SUMMARY = "Devel files for python310-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-devel-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "4bb89eacc214e8dc66503e826072c2d080cf4acd1caaa9b1e4e44f687eb359a20624ce9499a65b729c9bb4265669c19a81cb3f7b997c33cae2a9711ccabd3355"

RPROVIDES:${PN} += "python310-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python310-PyQt6-devel"

inherit rpm
