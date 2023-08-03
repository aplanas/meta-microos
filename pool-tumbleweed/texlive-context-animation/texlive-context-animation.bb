SUMMARY = "Generate fieldstack based animation with ConTeXt"
DESCRIPTION = "The package is a port, to Context (mkvi), of the corresponding \
LaTeX package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-animation-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "5eb0ef9ca009e3f7468ed739afb65a8a7927a022ba2e8f2edea08fa59138e586628b86117a6ad2507170e29143208f9a5d62dbbd0c1fd58a493e29015a8fd34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-animation"

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
