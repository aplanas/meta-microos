SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python310-PyICU-2.10.2-1.6.aarch64.rpm"
RPM_HASH = "a4ec7d01a4b02a48446ecba01a4e39c5729866f4fb81c789c6aca92b31b17e30c6f70e67b92530b9901a7888c7cf707a33471d0084c38d8117797bc8df71d1fa"

RPROVIDES:${PN} += "PyICU \
python3-ICU \
python3-PyICU \
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
