SUMMARY = "Binary files of luahbtex"
DESCRIPTION = "Binary files of luahbtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luahbtex-bin-2023.20230311.svn66511-91.1.aarch64.rpm"
RPM_HASH = "7679bb4ffa222d76e81d48c068036f6a78a4b5164c819cbe5ef44e07c80dd3f10f61229881b01df64680e77dfbee2983ddb669e3e54570f65c19f4201f3a3c2d"

RPROVIDES:${PN} += "texlive-luahbtex-bin \
texlive-luahbtex-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libharfbuzz.so.0()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtexlua53.so.5()(64bit) \
libz.so.1()(64bit) \
libzzip.so.13()(64bit) \
texlive-luahbtex"

inherit rpm
