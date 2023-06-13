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

RPM_NAME = "python310-editdistance-0.6.2-1.4.aarch64.rpm"
RPM_HASH = "a091c0c5a7b75ae7650d12f732287cf51bfd1fb4bcc365995552313cf5e3c993aa8230edb51f7975278d283a490d0376479cd242e3ca75a6d23275b69551aca9"

RPROVIDES:${PN} += "python3-editdistance \
python3.10dist(editdistance) \
python310-editdistance \
python310-editdistance(aarch-64) \
python3dist(editdistance)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-base"

inherit rpm
