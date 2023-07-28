SUMMARY = "Python bindings for Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the Python bindings of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "python3-openbabel-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "f69737471e2437fd5076b3df5e793d440db08092c40171c4e9f2bfdfe6acab724d921dd60e0559920bd4201aa8868824d6d8e44d96cda8c25ff3a53507c0164e"

RPROVIDES:${PN} += "python3-openbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenbabel.so.7 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
