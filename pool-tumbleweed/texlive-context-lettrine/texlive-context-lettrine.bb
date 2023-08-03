SUMMARY = "A ConTeXt implementation of lettrines"
DESCRIPTION = "This is a re-implementation of the LaTeX package lettrine."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-lettrine-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "7af0875b5c23ad1ad0c08d398eb38075274b227d93a956a5296adb7367ce2a97251ec714a860d7e7bd111f56e82f7ac5a6e4372c91f5ae32bbac4104d89db92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-lettrine.tex \
texlive-context-lettrine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
