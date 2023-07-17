SUMMARY = "Universal grep: a feature-rich grep implementation with focus on speed"
DESCRIPTION = "Ugrep supports an interactive query UI and can search file systems, source \
code, text, binary files, archives, compressed files, documents and use \
fuzzy search."
LICENSE = "BSD-3-Clause"

PV = "3.12.2"

RPM_NAME = "ugrep-3.12.2-1.1.aarch64.rpm"
RPM_HASH = "69ef99fd9faba5badf140caeafb01b7f289b5583e7d580df42384b0afd95a13a79de362bb0aedc750711a758a2d175a320807eb6b58e172d79f60908431834b7"

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
