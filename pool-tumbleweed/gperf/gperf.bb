SUMMARY = "A Compiler Tool for Generating Perfect Hash Functions"
DESCRIPTION = "A perfect hash function is simply: a hash function and a data structure \
that allows recognition of a key word in a set of words using exactly \
one probe into the data structure."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "gperf-3.1-4.5.aarch64.rpm"
RPM_HASH = "282644a1c34da27edb89d6cb5b64685806c7748a1a81334fbd324251276ee9ad54d749a580d475d8687fa79a7c2d448f7703ad58513edb3b9919fc8096bf9d38"

RPROVIDES:${PN} += "gperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
