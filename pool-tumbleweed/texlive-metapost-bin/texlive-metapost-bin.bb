SUMMARY = "Binary files of metapost"
DESCRIPTION = "Binary files of metapost"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metapost-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "91b9a212d625a7c5875861b964e71409d87e56f32d9a32eb259e74f9c1f41ea34831ce3e6cfcca8c9c8ba204e7716017e6fa3f2360aaf36347c882392c05760f"

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
