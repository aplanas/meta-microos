SUMMARY = "Binary files of metafont"
DESCRIPTION = "Binary files of metafont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metafont-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "3c07e0981e6d73b03d96565b91527487eb8add066cd0c519095c1ae1faa04d2a99a9c74a6d56ca9a2467bcd851efdec74549da47785aba561cc435169d89abd8"

RPROVIDES:${PN} += "texlive-metafont-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
texlive-metafont"

inherit rpm
