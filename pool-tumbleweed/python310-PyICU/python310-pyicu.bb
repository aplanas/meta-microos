SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.11"

RPM_NAME = "python310-PyICU-2.11-2.1.aarch64.rpm"
RPM_HASH = "a661dda91ce36ce5e018817637849981424f4a7bea0a7ccc8f4618f531dd591e96cea097df586d097623c6bd469166b2e2ffa9d84de712349ab18953315019b7"

RPROVIDES:${PN} += "PyICU \
python3.10dist-pyicu \
python310-ICU \
python310-PyICU \
python3dist-pyicu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libstdc++.so.6 \
python-abi"

inherit rpm
