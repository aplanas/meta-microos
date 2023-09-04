SUMMARY = "Binary files of lcdftypetools"
DESCRIPTION = "Binary files of lcdftypetools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-lcdftypetools-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "7cdddaa328b029d73ed9691110eaa941eac34ce3215947338c02d503102b8b0978cd551d0d79bffcf839b03a511b835064d891ea856b60634df635e2b127d4e4"

RPROVIDES:${PN} += "texlive-lcdftypetools-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-lcdftypetools"

inherit rpm
