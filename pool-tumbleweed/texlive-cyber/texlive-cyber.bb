SUMMARY = "Annotate compliance with cybersecurity requirements"
DESCRIPTION = "This LaTeX package helps you write documents indicating your \
compliance with cybersecurity requirements. It also helps you \
format your document in a form suitable inside the U.S. \
Department of Defense, by attaching distribution statements, \
destruction notices, organization logos, and security labels to \
it."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.2svn46776"

RPM_NAME = "texlive-cyber-2023.204.2.2svn46776-54.1.noarch.rpm"
RPM_HASH = "a4cc2fccb11b55136bce4aa3504062a53d5ca186a78333dac6e46efc52f14b1233b650909092c1c81b813cf3496b8f13a3c63b43777bf976b61bcc8d2d460ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cyber.sty) \
texlive-cyber"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(fancyhdr.sty) \
tex(graphicx.sty) \
tex(index.sty) \
tex(longtable.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
