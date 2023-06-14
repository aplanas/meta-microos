SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python39-PyICU-2.10.2-1.6.aarch64.rpm"
RPM_HASH = "919ca5966da84d79ff6c56220ae9dd9717b1b1742dc5d31832aec70b3e8bd1655ff583b2c7a3290a93af9eeee7c6b60b278728f797f6869116979ebca84d953c"

RPROVIDES:${PN} += "PyICU \
python3.9dist-pyicu \
python39-ICU \
python39-PyICU \
python3dist-pyicu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libstdc++.so.6 \
python-abi"

inherit rpm
