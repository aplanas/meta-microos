SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python311-PyICU-2.10.2-1.6.aarch64.rpm"
RPM_HASH = "bd80fc93061f98ca47b5e6e3d47e8855f84b7d8d0d725869e7f8ad612b603fec9ba31c77535bc17b2a26a498c99274e756195e75e86b9b203ec622bff1749377"

RPROVIDES:${PN} += "PyICU \
python3.11dist-pyicu \
python311-ICU \
python311-PyICU \
python3dist-pyicu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libstdc++.so.6 \
python-abi"

inherit rpm
