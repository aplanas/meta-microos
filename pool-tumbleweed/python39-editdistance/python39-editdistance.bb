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

RPM_NAME = "python39-editdistance-0.6.2-1.6.aarch64.rpm"
RPM_HASH = "88312526a62b1f037f9946b445de47f437710339dde6cfd3939cc5da7998bb14e38c06cbd7bcc7298707e248a05fc7663c7eaba76f7e3cc116a33127719d7685"

RPROVIDES:${PN} += "python3.9dist-editdistance \
python39-editdistance \
python3dist-editdistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-base"

inherit rpm
