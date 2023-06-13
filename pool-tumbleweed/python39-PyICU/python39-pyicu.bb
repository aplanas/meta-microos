SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python39-PyICU-2.10.2-1.6.aarch64.rpm"
RPM_HASH = "919ca5966da84d79ff6c56220ae9dd9717b1b1742dc5d31832aec70b3e8bd1655ff583b2c7a3290a93af9eeee7c6b60b278728f797f6869116979ebca84d953c"

RPROVIDES:${PN} += "PyICU \
python3.9dist(pyicu) \
python39-ICU \
python39-PyICU \
python39-PyICU(aarch-64) \
python3dist(pyicu)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi)"

inherit rpm
