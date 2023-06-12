SUMMARY = "An implementation of the edit distance (Levenshtein distance)"
DESCRIPTION = "An implementation of the edit distance (Levenshtein distance). \
 \
This library implements Levenshtein distance with C++ and Cython. \
 \
The algorithm used in this library is proposed by Heikki Hyyrö, \
'Explaining and extending the bit-parallel approximate string \
matching algorithm of Myers', (2001)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-editdistance-0.6.2-1.4.aarch64.rpm"
RPM_HASH = "362aab99a607c4a4588626a169ef4823a832bac00868d14c28b9a46f9a46ec998f1125405cdeb3eb1f4a51026d435249b3bd82a0adb3419a7b73bfcac61245c4"

RPROVIDES:${PN} += "python3.11dist(editdistance) \
python311-editdistance \
python311-editdistance(aarch-64) \
python3dist(editdistance)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python311-base"

inherit rpm