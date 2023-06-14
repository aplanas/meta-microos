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

PV = "2023.201.1.02svn43445"

RPM_NAME = "texlive-mucproc-2023.201.1.02svn43445-54.1.noarch.rpm"
RPM_HASH = "3cf9d6e2d4daaf6886171a9fa791d30a6da7cb84b7f86d30d3936e7b52f225e43b9228f80d7c148f96abd33854b1cd639ebe9c562c0219f4d97a029357e4c4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mucfontsize10pt.clo \
tex-mucproc.cls \
texlive-mucproc"

RDEPENDS:${PN} += "/bin/sh \
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
