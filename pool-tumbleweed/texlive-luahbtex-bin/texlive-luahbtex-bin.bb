SUMMARY = "Binary files of luahbtex"
DESCRIPTION = "Binary files of luahbtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luahbtex-bin-2023.20230311.svn66511-93.1.aarch64.rpm"
RPM_HASH = "4d4d1a74279466cc361034b21b0adc692d218267a1a4d0ed5e051681280c29d99e2bacd122d4140dcd04bb2d25c00f0a59499934b0205c587127f6c3aefaff01"

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
