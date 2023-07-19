SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66382"

RPM_NAME = "texlive-uptex-bin-2023.20230311.svn66382-93.1.aarch64.rpm"
RPM_HASH = "f6f8ad249e27ff841397618d21382210526f4d777029554d8da9d1154b7a2ac08f05ce4ffe862544b6b8fbbcd8bceaa1e16ebb28c0ca3cd4aa15d015d06dd135"

RPROVIDES:${PN} += "texlive-uptex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libptexenc.so.1 \
libz.so.1 \
texlive-uptex"

inherit rpm
