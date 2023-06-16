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

PV = "2023.201.1.1svn21922"

RPM_NAME = "texlive-verbasef-2023.201.1.1svn21922-53.1.noarch.rpm"
RPM_HASH = "a63182ee63e48d37d1d89bc6b422fdc539c04547d2e58287ba8959064533c2b1821fd08e9bb1affe2d98a0061890cd20e58c3348c6dcb88c8445c99a7eb85481"
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
