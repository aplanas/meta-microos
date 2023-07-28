SUMMARY = "Universal grep: a feature-rich grep implementation with focus on speed"
DESCRIPTION = "Ugrep supports an interactive query UI and can search file systems, source \
code, text, binary files, archives, compressed files, documents and use \
fuzzy search."
LICENSE = "BSD-3-Clause"

PV = "3.12.4"

RPM_NAME = "ugrep-3.12.4-1.1.aarch64.rpm"
RPM_HASH = "223498d8a76eb1a22ddba6a6cad5b2e84579edb47ad985ebe3e0001f900fd0dceac22cf9965727e67b27732f749428032e1edcb7db1b687b714eb7b400d70231"

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
