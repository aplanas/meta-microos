SUMMARY = "Annotate compliance with cybersecurity requirements"
DESCRIPTION = "This LaTeX package helps you write documents indicating your \
compliance with cybersecurity requirements. It also helps you \
format your document in a form suitable inside the U.S. \
Department of Defense, by attaching distribution statements, \
destruction notices, organization logos, and security labels to \
it."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn46776"

RPM_NAME = "texlive-cyber-2023.209.2.2svn46776-55.1.noarch.rpm"
RPM_HASH = "7d862cbad31f91eefc5df403ba6e9d35d55585e152952b5c78ecc90fead3337cdc5e52152aaffca9041dc0bce100b92156ddc1616833153df2e70cf1d761fafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cyber.sty \
texlive-cyber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-index.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
