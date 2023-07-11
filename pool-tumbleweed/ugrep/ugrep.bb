SUMMARY = "Universal grep: a feature-rich grep implementation with focus on speed"
DESCRIPTION = "Ugrep supports an interactive query UI and can search file systems, source \
code, text, binary files, archives, compressed files, documents and use \
fuzzy search."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "ugrep-3.12.1-1.1.aarch64.rpm"
RPM_HASH = "aed8ca744782bf8d9167df92c96f8345544f4cb221dfc326b8c08d84f2b0e3288b9506abd4b4729238b2734c4e6d8e0aa659afcf6f3ce4799dfc9a5af093f491"

RPROVIDES:${PN} += "ugrep"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
liblzma.so.5 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
