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

RPM_NAME = "python311-editdistance-0.6.2-1.6.aarch64.rpm"
RPM_HASH = "76697fdb6783c3fa4657ab93d11c3b8845198e42219ad89c19e08e38462db6cd575d9d9349ad15b85eaf1fcfe36ac122cd6fd2646e0e7ed963105bd12953c590"

RPROVIDES:${PN} += "python3-editdistance \
python3.11dist-editdistance \
python311-editdistance \
python3dist-editdistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-base"

inherit rpm
