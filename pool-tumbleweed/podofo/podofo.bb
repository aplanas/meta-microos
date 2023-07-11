SUMMARY = "Tools to work with PDF files"
DESCRIPTION = "Command line tools for working with PDF files."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.8"

RPM_NAME = "podofo-0.9.8-1.11.aarch64.rpm"
RPM_HASH = "d5616e294fe0dcae9d7b5c714ebe478faa460c3be367dd0d275bec5c4c977a95a5f16680b50c3540456f5e6f1f30df24e648e484561b0ea55fdf4fbce7bc150e"

RPROVIDES:${PN} += "podofo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpodofo.so.0.9.8 \
libstdc++.so.6"

inherit rpm
