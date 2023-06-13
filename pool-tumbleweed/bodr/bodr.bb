SUMMARY = "Blue Obelisk Data Repository"
DESCRIPTION = "The Blue Obelisk Data Repository lists many important chemoinformatics data \
such as element and isotope properties, atomic radii, etc. including \
references to original literature. Developers can use this repository to make \
their software interoperable."
LICENSE = "CC0-1.0"

PV = "10"

RPM_NAME = "bodr-10-1.10.noarch.rpm"
RPM_HASH = "7729440840f873e0bff0feeaf156fd94eca7b1eb10313c854fb9ab286ad1e9c45346d515b43d50fd4e27b6f3fee562d967d54d8cbb9c90b483cd1460f2e3a6af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bodr \
pkgconfig(bodr)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
