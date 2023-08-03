SUMMARY = "Converter for PostScript, EPS and PDF"
DESCRIPTION = "Epspdftk.tcl is a GUI ps/eps/pdf converter. Epspdf.tlu, its \
command-line backend, can be used by itself. Options include \
grayscaling, cropping margins and single-page selection. Some \
conversion options are made possible by converting in multiple \
steps."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-2023.209.0.0.6.5.1svn66115-54.1.noarch.rpm"
RPM_HASH = "172aeeb92e95c280f7cd4b622d7e123c160209bfc4a4499510907d53cb6090e3e738d6ac5bbc9b4458f86c926a1e20ff945d2dca241ee616809a5ae7bc4a707f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
/usr/bin/wish \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-epspdf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
