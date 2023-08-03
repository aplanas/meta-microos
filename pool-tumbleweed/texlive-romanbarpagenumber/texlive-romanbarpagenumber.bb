SUMMARY = "Typesetting roman page numbers"
DESCRIPTION = "The package romanbar allows to typeset roman numbers with bars. \
This package allows you to use those roman numbers as page \
number."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36236"

RPM_NAME = "texlive-romanbarpagenumber-2023.209.1.0svn36236-54.1.noarch.rpm"
RPM_HASH = "421b26af0dfe7f72e0873a11d6e225a49515f1e9e1cf344bcd295bd910483eea82652f0fb45bd8f2a08239819bed515a8b766d8aa5cee7dd07bda29b259161a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanbarpagenumber.sty \
texlive-romanbarpagenumber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-romanbar.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
