SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python310-apfel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "f10749aaaa9dec1707984377aaabcf4adcf20ceb594c8320d9de07299bcbb7c27ed8757c80dbd545143c65812c6eaf600780b19ea3279e13f94c5ccdc450c03b"

RPROVIDES:${PN} += "python3-apfel \
python3.10dist(apfel) \
python310-apfel \
python310-apfel(aarch-64) \
python3dist(apfel)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libAPFEL.so.0()(64bit) \
libLHAPDF-6.5.4.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi) \
python310-LHAPDF \
update-alternatives"

inherit rpm
