SUMMARY = "Tests for libpcre"
DESCRIPTION = "This package contains the testsuite part of the PCRE library."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-testsuite-8.45-2.7.aarch64.rpm"
RPM_HASH = "da494e1ae46ecc091bb268e0640ba29ff876c5c56099e080557ea476872861092da8ecdf87420be0c78401944404ebabc07ad3d45eb534d8c75b4faa6684fcf4"

RPROVIDES:${PN} += "pcre-testsuite"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre.so.1 \
libpcre16.so.0 \
libpcrecpp.so.0 \
libpcreposix.so.0 \
libstdc++.so.6"

inherit rpm
