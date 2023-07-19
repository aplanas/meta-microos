SUMMARY = "Binary files of lcdftypetools"
DESCRIPTION = "Binary files of lcdftypetools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-lcdftypetools-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "d8b8b2d9ab1526ffbfae8a8904e96960e6de1e880ee952013d336f30d5ab8ad8ed634013f65562be35f8ae48ab8dad48b9733b03463eb0bd5543f964627f81da"

RPROVIDES:${PN} += "texlive-lcdftypetools-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-lcdftypetools"

inherit rpm
