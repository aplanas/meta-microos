SUMMARY = "Adobe Font Development Kit for OpenType"
DESCRIPTION = "Adobe Font Development Kit for OpenType"
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.3"

RPM_NAME = "python311-afdko-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "89f3bea6361a38f1f38a7dd96a7a7a6522b83dfd0bd9eb3d18579491976a36d7de6babea3f3dad649e74481c94eb60ef58f9267f65036ce74f8034d873b595cf"

RPROVIDES:${PN} += "adobe-afdko \
python3.11dist(afdko) \
python311-afdko \
python311-afdko(aarch-64) \
python3dist(afdko)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
python311-Brotli \
python311-FontTools \
python311-booleanOperations \
python311-defcon \
python311-fontMath \
python311-fontPens \
python311-fs \
python311-lxml \
python311-mutatorMath \
python311-psautohint \
python311-tqdm \
python311-ufoProcessor \
python311-ufonormalizer \
python311-zopfli \
update-alternatives"

inherit rpm
