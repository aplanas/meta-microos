SUMMARY = "Adobe Font Development Kit for OpenType"
DESCRIPTION = "Adobe Font Development Kit for OpenType"
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.3"

RPM_NAME = "python310-afdko-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "f40853cd149a3427cbe1757fe73fb431217f3b53c5dfff08df00fdc2a6bdf2edb9139156784fb349dba561f225eec0eed618aead7c868d0e123ed0f24965c853"

RPROVIDES:${PN} += "adobe-afdko \
python3-afdko \
python3.10dist(afdko) \
python310-afdko \
python310-afdko(aarch-64) \
python3dist(afdko)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
python(abi) \
python310-Brotli \
python310-FontTools \
python310-booleanOperations \
python310-defcon \
python310-fontMath \
python310-fontPens \
python310-fs \
python310-lxml \
python310-mutatorMath \
python310-psautohint \
python310-tqdm \
python310-ufoProcessor \
python310-ufonormalizer \
python310-zopfli \
update-alternatives"

inherit rpm
