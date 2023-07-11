SUMMARY = "Binary files of metafont"
DESCRIPTION = "Binary files of metafont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metafont-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "aa8b4a04debb494af442a2b449660d482e76b4598a5d865b5802f990e4fd2fda1ac580acc20f7bac3a15b82db4d6fc02e239e2f84a6737ee9007e668a2cc1d81"

RPROVIDES:${PN} += "texlive-metafont-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
texlive-metafont"

inherit rpm
