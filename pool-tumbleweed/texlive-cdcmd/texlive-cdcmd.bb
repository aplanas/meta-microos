SUMMARY = "Expandable conditional commands for LaTeX"
DESCRIPTION = "This package provides some conditional commands, just like the \
styledcmd package. The difference is that cdcmd can define \
expandable conditional commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn60742"

RPM_NAME = "texlive-cdcmd-2023.209.1.0svn60742-53.1.noarch.rpm"
RPM_HASH = "df203224bd4a3c051479ef336abf8384fd302e3480a428253333f45fc8618ca7808873d3a0446fb2431b45df33c6a1a359dc0f4cfd7b9b454d5c6e3e1986d78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cdcmd.sty \
texlive-cdcmd"

RDEPENDS:${PN} += "/usr/bin/sh \
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
