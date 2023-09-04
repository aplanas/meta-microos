SUMMARY = "Binary files of metapost"
DESCRIPTION = "Binary files of metapost"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metapost-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "69f7f64e9a8d40bbaf393a86a3fda239399d0ec226fcc33367ead6b8cdb28f052e9ccb507e908803ee8bd1ced00d82db7db6cc3f421ac24754ff20f9c9f7a2c8"

RPROVIDES:${PN} += "texlive-metapost-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libz.so.1 \
texlive-metapost"

inherit rpm
