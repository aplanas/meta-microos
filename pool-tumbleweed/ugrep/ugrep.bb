SUMMARY = "Universal grep: a feature-rich grep implementation with focus on speed"
DESCRIPTION = "Ugrep supports an interactive query UI and can search file systems, source \
code, text, binary files, archives, compressed files, documents and use \
fuzzy search."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "ugrep-4.0.5-1.1.aarch64.rpm"
RPM_HASH = "54733de1d643295876d4c616b874cf94d48bf29e25036189e47bc82c052b32f8ded2589718d25c3612f78ff032e31e9fcc724667213ee117a73aad054c2cdf78"

RPROVIDES:${PN} += "ugrep"

RDEPENDS:${PN} += "/usr/bin/sh \
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
