SUMMARY = "Python bindings for Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the Python bindings of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "python3-openbabel-3.1.1-1.4.aarch64.rpm"
RPM_HASH = "0b556b269b3b742a4a50b514680e6d7d427eeb0addcf42ed1ae11ccaa790ac301f4fb7a311d1c4f3ee133a071b2539942cb0e59a90ac6b8ae77500ed2e2add59"

RPROVIDES:${PN} += "python3-openbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenbabel.so.7 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
