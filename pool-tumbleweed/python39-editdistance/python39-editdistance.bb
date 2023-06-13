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

RPM_NAME = "python39-editdistance-0.6.2-1.4.aarch64.rpm"
RPM_HASH = "894be8d4180cd5f049b9d8c046659b5372070fb193afc6a152b4742195e1e324dc57c1eee5115caac5ddfcc996cb1d4e668043812dbd60b593ee0e52822a647e"

RPROVIDES:${PN} += "python3.9dist(editdistance) \
python39-editdistance \
python39-editdistance(aarch-64) \
python3dist(editdistance)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-base"

inherit rpm
