SUMMARY = "Python bindings for Open Babel, a chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the Python bindings of Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "python3-openbabel-3.1.1-1.5.aarch64.rpm"
RPM_HASH = "f620ec94dd31ec02be7329049821be3163f03c6ffa7b65a4a25c090e64ce97e0403aec9cbc2e75f44c19b34fe010b7e0416fb18ec1d81f4f09ee484c44b76551"

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
