SUMMARY = "Binary files of xetex"
DESCRIPTION = "Binary files of xetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-xetex-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "fd768c8de2d2edc547ae9aa75adf9d77b0796da454db761aa14c96b6d20f165e9ee763a2d75beaef1b59323f4e15fb1ed86832ee852aa3ca03396c8617183af3"

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
