SUMMARY = "Syntax-Highlighting of program code"
DESCRIPTION = "The package is based on pygmentex but provides an automatic run \
from within the document itself, with the option \
--shell-escape. It does not need the additional action by the \
user to run the external program pygmentize to create the code \
snippets."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-2023.208.0.0.01svn62405-53.1.noarch.rpm"
RPM_HASH = "1239b34810b6d04b9e0edca2dcab2e04208284e1d6bffdc1336e641c4867b0eb9a16ec32f52def030031377a9c9f7b81950e846b5f3168d0dcefaed8385205c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvpygmentex.sty \
texlive-hvpygmentex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-color.sty \
tex-efbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-mdframed.sty \
tex-pgfkeys.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
