SUMMARY = "Converter for PostScript, EPS and PDF"
DESCRIPTION = "Epspdftk.tcl is a GUI ps/eps/pdf converter. Epspdf.tlu, its \
command-line backend, can be used by itself. Options include \
grayscaling, cropping margins and single-page selection. Some \
conversion options are made possible by converting in multiple \
steps."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-2023.209.0.0.6.5.1svn66115-54.2.noarch.rpm"
RPM_HASH = "9e37dcefb1b67584e8660b23f8c741bb1f1f68319d15303e1dcc5a4e858ff84db346a3b4673182731e0872b855b98691e08e2968c2f8956e18d94b89a3785fd7"
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
