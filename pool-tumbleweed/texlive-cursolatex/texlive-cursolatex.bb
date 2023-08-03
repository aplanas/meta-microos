SUMMARY = "A LaTeX tutorial"
DESCRIPTION = "The tutorial is presented as a set of slides (in Portuguese)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn24139"

RPM_NAME = "texlive-cursolatex-2023.209.svn24139-55.1.noarch.rpm"
RPM_HASH = "fed75aa62f564ce2ce6884bf1df5da46c14485adb6d351fb9709da4cd822688b3f088ebb1998909abf3a8db185aadbaf91610c688ad86ed75ef4d9a4fe6744ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cursolatex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
