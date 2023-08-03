SUMMARY = "VERBatim Automatic Splitting of External Files"
DESCRIPTION = "The package allows you to input (subsections of a) file, print \
them in verbatim mode, while automatically breaking up the \
input lines into pieces of a given length, which are output as \
figures. These figures are posted using the [H] specification, \
which forces LaTeX to place the figure at the spot of \
invocation, rather than floating the figures to the top of the \
next page. The package requires the verbatim, here and vrbexin \
packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn21922"

RPM_NAME = "texlive-verbasef-2023.209.1.1svn21922-54.1.noarch.rpm"
RPM_HASH = "df9eadfe20a4265dcc322293a46371ecaf411d595722766e7f4b3d72d536f1f8f39f039b965eaed5ba9f9afc939236332d57d19598895060662f40bc5bd928df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbasef.sty \
texlive-verbasef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-here.sty \
tex-verbatim.sty \
tex-vrbexin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
