SUMMARY = "Books and tutorials from the 'Dickimaw LaTeX Series'"
DESCRIPTION = "The package provides some of the books and tutorials that form \
part of the 'Dickimaw LaTeX Series'. Only the A4 PDF of each \
book is detailed here. Other formats, such as HTML or screen \
optimized PDF, are available from the package home page. Books \
included are: 'LaTeX for Complete Novices': an introductory \
guide to LaTeX. 'Using LaTeX to Write a PhD Thesis': a \
follow-on from 'LaTeX for Complete Novices' geared towards \
students who want to use LaTeX to write their PhD thesis. \
'Creating a LaTeX minimal example': describes how to create a \
minimal example, which can be used as a debugging aid when you \
encounter errors in your LaTeX documents."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.svn32925"

RPM_NAME = "texlive-dickimaw-2023.201.svn32925-52.1.noarch.rpm"
RPM_HASH = "d730da17691647ea53d821e0d313d67638cc9f385bfdb372040423831392c09664a134f9971f8a9bed8b2767f31a5d4ff03ee6f237ecf89ae763a55208075c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dickimaw"

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
