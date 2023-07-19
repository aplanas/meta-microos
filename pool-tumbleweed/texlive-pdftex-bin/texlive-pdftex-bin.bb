SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-pdftex-bin-2023.20230311.svn66084-93.1.aarch64.rpm"
RPM_HASH = "ee4f98b3e610ab326d9af68ed4b23f6a14ddfb867c3a0fafd1b4fb5503259bfe1d07aa9ebacb11a84da732c50de4428dfbb6e63b401bc87aa2b79c961bf392ee"

RPROVIDES:${PN} += "texlive-pdftex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-pdftex"

inherit rpm
