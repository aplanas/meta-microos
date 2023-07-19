SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-ptex-bin-2023.20230311.svn66084-93.1.aarch64.rpm"
RPM_HASH = "2c4a675cd9ad70febafb474e3572c94d4059db97c146240e67ef0b2ff56906bd8b822d2dbecd4eaa54737e6e814e496d04c696ea041af024240a2586cdf7bd63"

RPROVIDES:${PN} += "texlive-ptex-bin"

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
texlive-ptex"

inherit rpm
