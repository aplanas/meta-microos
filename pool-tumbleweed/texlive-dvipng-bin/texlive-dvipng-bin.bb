SUMMARY = "Binary files of dvipng"
DESCRIPTION = "Binary files of dvipng"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipng-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "526d288545b126d5c90180cbd1c54e1054710466e54156c4b5419c4e46ce98a83483d53e744e04a1c7557baf8505af9055745c721d588e65602444d5ad6f2e2c"

RPROVIDES:${PN} += "texlive-dvipng-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgd.so.3 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvipng"

inherit rpm
