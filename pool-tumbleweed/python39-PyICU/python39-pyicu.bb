SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.11"

RPM_NAME = "python39-PyICU-2.11-2.1.aarch64.rpm"
RPM_HASH = "7a6881af2c56373909ea54e33584a9ba70bb48bee997fd9bd7b0f396d68afe08584dfea996132a56ed984621b1c1c54171121f317df59ddf7807932358d5fd3e"

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
