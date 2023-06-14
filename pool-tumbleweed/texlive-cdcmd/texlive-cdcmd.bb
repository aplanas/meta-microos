SUMMARY = "Expandable conditional commands for LaTeX"
DESCRIPTION = "This package provides some conditional commands, just like the \
styledcmd package. The difference is that cdcmd can define \
expandable conditional commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn60742"

RPM_NAME = "texlive-cdcmd-2023.201.1.0svn60742-52.1.noarch.rpm"
RPM_HASH = "bd5c2341e0ccdd666916dffc7c783ffec94fc8492b9f68af42c8fb038167d24d9ba3d5432dbe1e2914984739d10b2e39774846b119a5941071df4cfb182e403e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cdcmd.sty \
texlive-cdcmd"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
