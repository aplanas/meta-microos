SUMMARY = "Syntax-Highlighting of program code"
DESCRIPTION = "The package is based on pygmentex but provides an automatic run \
from within the document itself, with the option \
--shell-escape. It does not need the additional action by the \
user to run the external program pygmentize to create the code \
snippets."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-2023.209.0.0.01svn62405-54.1.noarch.rpm"
RPM_HASH = "cad6beb282c1ab621029ffd2bcb7ee98decf3145ba363232545e8a3b18b019f1761cc08e78640998f46dd683a59953c69d4e36d7d83626ac0c34ea6f556b4e0c"
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
