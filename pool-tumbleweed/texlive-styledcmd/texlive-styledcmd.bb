SUMMARY = "Handling multiple versions of user-defined macros"
DESCRIPTION = "This package allows creating and maintaining different versions \
of the same command, in order to choose the best option for \
every document. This includes expandable and protected \
commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn65262"

RPM_NAME = "texlive-styledcmd-2023.209.2.0svn65262-58.1.noarch.rpm"
RPM_HASH = "e86929a623d2a217ba6e2b2e61f05e032ba4a3a7fd313328481a1b17b37f266e3c5755d87e9faee32466edc1d0937c7e0a5b70b83b8019ab40a020a58dba167e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-styledcmd.sty \
texlive-styledcmd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-lt3rawobjects.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
