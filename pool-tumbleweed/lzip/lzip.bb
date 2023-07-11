SUMMARY = "Lossless Data Compressor based on the LZMA Algorithm"
DESCRIPTION = "Lzip is a lossless data compressor based on the LZMA algorithm, with very safe \
integrity checking and a user interface almost identical to the one of \
bzip2. Lzip is only a data compressor, not an archiver. It has no facilities \
for multiple files, encryption, or archive-splitting, but, in the Unix \
tradition, relies instead on separate external utilities such as GNU Tar for \
these tasks."
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "lzip-1.23-1.8.aarch64.rpm"
RPM_HASH = "c3368843d7c6a5fb1085b83a9c8764c6be1ee655e81752f03fc12ad206bc6e430610775a3be36cc5144f037097dc41884188a3bcb259bab01bae37f9e5c0a2a5"

RPROVIDES:${PN} += "lzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
