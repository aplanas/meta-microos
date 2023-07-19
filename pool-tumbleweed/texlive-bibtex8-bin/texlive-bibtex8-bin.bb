SUMMARY = "Binary files of bibtex8"
DESCRIPTION = "Binary files of bibtex8"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex8-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "10468d0cc4117878311a00527ed7750cc3ecf30df131c6845eaa68994227683d3f6c29fc521a032ef2ed865f9eff4db104989a2c93890ef28aac0fd20daff5ba"

RPROVIDES:${PN} += "texlive-bibtex8-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex8"

inherit rpm
