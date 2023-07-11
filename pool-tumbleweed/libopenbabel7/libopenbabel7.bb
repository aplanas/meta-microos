SUMMARY = "Component library of Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the shared library of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libopenbabel7-3.1.1-1.5.aarch64.rpm"
RPM_HASH = "6d79f934e6577ce5035f5211b450f0b3bbf7f2175099c0a835fb1b180c9e8f60ba09c82921cc9698fb1c195fc684fcfa0ef1c799aae38df83eea86eed652ea08"

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
