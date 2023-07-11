SUMMARY = "3D graphics using VRML for Octave"
DESCRIPTION = "3D graphics using VRML. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.0.13"

RPM_NAME = "octave-forge-vrml-1.0.13-1.23.aarch64.rpm"
RPM_HASH = "e7fcc07b72ba031d46d11f04b8dc89021c8aca280e323afe8e99b9534044f3a3be62e7d5a10366e165396ef28eeadf2a3fa1254c1bd2f9c67aaa082b3ab08f0e"

RPROVIDES:${PN} += "octave-forge-vrml"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-linear-algebra \
octave-forge-miscellaneous \
octave-forge-statistics \
octave-forge-struct"

inherit rpm
