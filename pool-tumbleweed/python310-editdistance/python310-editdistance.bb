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

RPM_NAME = "python310-editdistance-0.6.2-1.6.aarch64.rpm"
RPM_HASH = "69bf34c68b63ab2fc32c99013db109523ac3226f2b99a7e709a9c57df804832a6187860cca17293b71803beefac0756373e392b0b670d480fa3f3bc3102037e7"

RPROVIDES:${PN} += "python3.10dist-editdistance \
python310-editdistance \
python3dist-editdistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-base"

inherit rpm
