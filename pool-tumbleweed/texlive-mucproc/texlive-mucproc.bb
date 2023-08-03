SUMMARY = "Conference proceedings for the German MuC-conference"
DESCRIPTION = "The mucproc.cls is a document class to support the formatting \
guidelines for submissions to the German Mensch und Computer \
conference. This work consists of the files mucproc.dtx and \
mucproc.ins and the derived files mucproc.cls, \
mucfontsize10pt.clo. A compilable demonstration file using the \
mucproc class can be found on \
https://github.com/Blubu/mucproc/. This example fulfills the \
formatting guidelines for MuC 2017."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn43445"

RPM_NAME = "texlive-mucproc-2023.209.1.02svn43445-55.1.noarch.rpm"
RPM_HASH = "dc8797efdb12aec0c81475c471db641e6e2ec13ace69e6516f9da138e994f87dccdb831e245886a1d4244a6eaad5a30742cecbdc832eead03b1e2a87dc1ab446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mucfontsize10pt.clo \
tex-mucproc.cls \
texlive-mucproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-biblatex.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-pdfx.sty \
tex-scrartcl.cls \
tex-scrbase.sty \
tex-scrlayer-scrpage.sty \
tex-txfonts.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
