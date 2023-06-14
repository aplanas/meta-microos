SUMMARY = "Component library of Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the shared library of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libopenbabel7-3.1.1-1.4.aarch64.rpm"
RPM_HASH = "59c8763dc25452c7126914217d37cd81a00a6c0d032b88f5c94b711f0b4746ad0dfcdf508870990936645345873553fdd67819cec3ee0e64c42459dc76705094"

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
