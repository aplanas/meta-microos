SUMMARY = "Binary files of xetex"
DESCRIPTION = "Binary files of xetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-xetex-bin-2023.20230311.svn66084-93.1.aarch64.rpm"
RPM_HASH = "b53b2858a84e1a15fe9b68e35f6b3ece35cfa87d51da23df66e79fc74cede912b895955265cbd82a9dee30173842b14b6c2319d922061268a457bbd7d2cd2442"

RPROVIDES:${PN} += "texlive-xetex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libharfbuzz.so.0 \
libicuuc.so.73 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-xetex"

inherit rpm
