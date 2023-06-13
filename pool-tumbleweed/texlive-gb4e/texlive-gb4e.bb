SUMMARY = "Linguistic tools"
DESCRIPTION = "Provides an environment for linguistic examples, tools for \
glosses, and various other goodies. The code was developed from \
the midnight and covington packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19216"

RPM_NAME = "texlive-gb4e-2023.201.svn19216-52.1.noarch.rpm"
RPM_HASH = "9529d1e52510656699f6f35b7300b9fe9aca0709aed52a8299a0380a6495884e34ff6d0599831adf22a651ff4d0f097a2925cf9655b0e267a704b666d6c37751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cgloss4e.sty) \
tex(gb4e.sty) \
texlive-gb4e"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
