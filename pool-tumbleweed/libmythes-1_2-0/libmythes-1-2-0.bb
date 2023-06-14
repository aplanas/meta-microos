SUMMARY = "A simple thesaurus for Libreoffice"
DESCRIPTION = "MyThes is a simple thesaurus that uses a structured text data file and an \
index file with binary search to look up words and phrases and return \
information on part of speech, meanings, and synonyms."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "libmythes-1_2-0-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "3dd76d3954659e90e9f1ec2a3e0821eaa31e3624e0d8190ee6a99d703675a3011a3740430337fd60ef766b99701e4d72db97e0da4767846a220fbc087ec134af"

RPROVIDES:${PN} += "libmythes-1-2-0 \
libmythes-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
