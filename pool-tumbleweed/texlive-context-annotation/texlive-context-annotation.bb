SUMMARY = "Annotate text blocks"
DESCRIPTION = "The annotation module lets you create your own commands and \
environments to mark text blocks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-annotation-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "dde2675b7f742e6d7ae8696ebac3df3d0df77a05c8739de08cb7242e8503f5ba6b302c8c4b46efa2fabe8e7e3077fd3ea50bbc2f1ea0334bd5c0965ce03f9bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-annotation"

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
