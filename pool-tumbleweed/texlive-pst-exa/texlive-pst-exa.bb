SUMMARY = "Typeset PSTricks examples, with code"
DESCRIPTION = "The (PSTricks-related) package provides an environment \
PSTexample to put code and output side by side or one above the \
other."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.06svn45289"

RPM_NAME = "texlive-pst-exa-2023.201.0.0.06svn45289-52.1.noarch.rpm"
RPM_HASH = "3f4e7ba438e43287afbaaf7da641adc2bf819d6e00160884037779c717aa458a83f857d2a3228fd605d2e3dd72bbd2dd4e45154803def9fdcbd6b1c822772949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-exa.sty) \
texlive-pst-exa"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(accsupp.sty) \
tex(changepage.sty) \
tex(etoolbox.sty) \
tex(showexpl.sty) \
tex(tcolorbox.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
