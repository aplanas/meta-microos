SUMMARY = "Component library of Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the shared library of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libopenbabel7-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "7e589f1a88650f448019c009da5425f9e0923ddd192dba69dd8c433c6e4e502c3e75652c68169541cacd40b63488f120dcd678e0e2e4e0912bdc78aab629d2c9"

RPROVIDES:${PN} += "libopenbabel.so.7 \
libopenbabel7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libinchi.so.1 \
libm.so.6 \
libmaeparser.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
