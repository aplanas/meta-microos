SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.11"

RPM_NAME = "python311-PyICU-2.11-2.1.aarch64.rpm"
RPM_HASH = "0ac66bf90cab7134764364dbe08efaf8b987f2b3085ebf7aee631e73e29862f912f3ca229f808f5fc08858c87e9cac53f6d4883c272ba6f1229c03ac7184fe4f"

RPROVIDES:${PN} += "PyICU \
python3-ICU \
python3-PyICU \
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
