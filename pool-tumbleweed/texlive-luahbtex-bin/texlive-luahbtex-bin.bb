SUMMARY = "Binary files of luahbtex"
DESCRIPTION = "Binary files of luahbtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luahbtex-bin-2023.20230311.svn66511-93.2.aarch64.rpm"
RPM_HASH = "15db93e61ffe3f3328d41adf1356cc14b67f71b1cba97514ad27baefdaa4c1f52da7760e25def344d42f85dac51cf413b83dc9ea61c32d6e9838a59754cac847"

RPROVIDES:${PN} += "texlive-luahbtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexlua53.so.5 \
libz.so.1 \
libzzip.so.13 \
texlive-luahbtex"

inherit rpm
