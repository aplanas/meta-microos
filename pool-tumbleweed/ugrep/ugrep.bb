SUMMARY = "Universal grep: a feature-rich grep implementation with focus on speed"
DESCRIPTION = "Ugrep supports an interactive query UI and can search file systems, source \
code, text, binary files, archives, compressed files, documents and use \
fuzzy search."
LICENSE = "BSD-3-Clause"

PV = "3.11.2"

RPM_NAME = "ugrep-3.11.2-1.1.aarch64.rpm"
RPM_HASH = "52dea65241ce9489db6cdce3922a1ae0c1861fc1959f5fc98ff1af56dc0bfe6061ab9c012b85916e2ce071b4481cad7bebd0e0126a82de243035f0d00a8918fa"

RPROVIDES:${PN} += "ugrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
