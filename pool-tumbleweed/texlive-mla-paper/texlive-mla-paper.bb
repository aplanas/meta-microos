SUMMARY = "Proper MLA formatting"
DESCRIPTION = "The package formats articles using the MLA style ('MLA' = \
'Modern Language Association'). The aim is that students and \
other academics in the humanities should be able to typeset \
their materials, properly, with minimal effort on their part."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-mla-paper-2023.209.svn54080-55.1.noarch.rpm"
RPM_HASH = "e40a926ba331ac7349b19ab1fdf8ce7adbcec14ea3855252c7255c5de13ada68e0473282badf57b7ab4d60301c75484d5997f7d84d3d7c37f6027b3b648d5b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mla.sty \
texlive-mla-paper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-thumbpdf.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
