SUMMARY = "Binary files of axodraw2"
DESCRIPTION = "Binary files of axodraw2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-axodraw2-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "28134d2d0c9047225941d7586f92843bded3920777ff7e25833e5dfc7f80831f733a5bf2dac3736a0468589f6f728aed90a2e9df416626b5c2d6e7f73e5df8a0"

RPROVIDES:${PN} += "texlive-axodraw2-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-axodraw2"

inherit rpm
