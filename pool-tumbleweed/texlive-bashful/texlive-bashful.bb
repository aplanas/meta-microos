SUMMARY = "Invoke bash commands from within LaTeX"
DESCRIPTION = "The package makes it possible to execute Unix bash shell \
scripts from within LaTeX. The main application is in writing \
computer-science texts, in which you want to make sure the \
programs listed in the document are executed directly from the \
input. The package may use other Unix shells than bash, but \
does not work without modification in a Windows environment. \
The package requires the -shell-escape flag when LaTeX is \
processing your document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.93svn25597"

RPM_NAME = "texlive-bashful-2023.209.0.0.93svn25597-54.1.noarch.rpm"
RPM_HASH = "7b079bbdc94fc936f3a8f33e035fe6017e11516340bae4257a8186d9d0401696c60c484e517080af92a6cf7727c1ee0b7023965b9e709a141c01d089ad0c8026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bashful.sty \
texlive-bashful"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
