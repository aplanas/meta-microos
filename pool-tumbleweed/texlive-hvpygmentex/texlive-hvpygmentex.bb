SUMMARY = "Syntax-Highlighting of program code"
DESCRIPTION = "The package is based on pygmentex but provides an automatic run \
from within the document itself, with the option \
--shell-escape. It does not need the additional action by the \
user to run the external program pygmentize to create the code \
snippets."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-2023.201.0.0.01svn62405-52.1.noarch.rpm"
RPM_HASH = "0a791563c5d946b9bd0afefb3e55b10fdc915fdd01c01d16e61af517f78c0d193f833ca99f25259ba1fd128e668cc0ceeb88655b0e28618595ada65b6e104116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hvpygmentex.sty) \
texlive-hvpygmentex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(caption.sty) \
tex(color.sty) \
tex(efbox.sty) \
tex(fancyvrb.sty) \
tex(ifthen.sty) \
tex(mdframed.sty) \
tex(pgfkeys.sty) \
tex(shellesc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
