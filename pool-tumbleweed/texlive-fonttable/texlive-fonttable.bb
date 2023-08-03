SUMMARY = "Print font tables from a LaTeX document"
DESCRIPTION = "This is a package version of nfssfont.tex (part of the LaTeX \
distribution); it enables you to print a table of the \
characters of a font and/or some text (for demonstration or \
testing purposes), from within a document. (Packages such as \
testfont and nfssfont.tex provide these facilities, but they \
run as interactive programs: the user is expected to type \
details of what is needed.) Note that the package mftinc also \
has a \\fonttable function; the documentation explains how avoid \
a clash with that package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6csvn44799"

RPM_NAME = "texlive-fonttable-2023.209.1.6csvn44799-53.1.noarch.rpm"
RPM_HASH = "42af413151a5b41ba5146df72a81abcd2f38b38e000cdf607ab18d76d09321284c0d130d0c8347e8ccd372eacc818f2f9fe39a76da2a21d64ded61798d3cf8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fonttable.sty \
texlive-fonttable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
