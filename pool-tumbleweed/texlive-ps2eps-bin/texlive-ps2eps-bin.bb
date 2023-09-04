SUMMARY = "Binary files of ps2eps"
DESCRIPTION = "Binary files of ps2eps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-ps2eps-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "ff39618f5dd838781e9707519b66590e8f1568c9e88664ba72737fde53e2f8e2f073c3b5d2ade3e3d774b31dc67889905de2b24a709f9096eead9d509f9d1f7f"

RPROVIDES:${PN} += "texlive-ps2eps-bin \
texlive-pstools-bin-/usr/bin/bbox \
texlive-pstools-bin-/usr/bin/ps2eps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-ps2eps"

inherit rpm
