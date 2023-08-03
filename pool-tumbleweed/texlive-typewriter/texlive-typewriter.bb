SUMMARY = "Typeset with a randomly variable monospace font"
DESCRIPTION = "The typewriter package uses the OpenType Computer Modern \
Unicode Typewriter font, together with a LuaTeX virtual font \
setup that introduces random variability in grey level and \
angle of each character. It was originally an answer to a \
question on stackexchange."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46641"

RPM_NAME = "texlive-typewriter-2023.209.1.1svn46641-53.1.noarch.rpm"
RPM_HASH = "dffbd502297c1d191856e1143ef91c5aebcb9e3dc37d8ffd1836df35fe0d91014a183e6f9e5325bb4a89d4dc914193e2698ab1a9b9ba6975e8a92d6e7caa4df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typewriter.sty \
texlive-typewriter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luaotfload.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
