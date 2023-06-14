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

PV = "2023.201.1.6csvn44799"

RPM_NAME = "texlive-fonttable-2023.201.1.6csvn44799-52.1.noarch.rpm"
RPM_HASH = "de30c5d5856c6fb775945e38809699f9ba5f3dc1e5ad8257968cba594cdd39531a270a5034d4451b18652c8bb29759d8f613ed4f4eb31e6d14b11aa112f82cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fonttable.sty \
texlive-fonttable"

RDEPENDS:${PN} += "/bin/sh \
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
