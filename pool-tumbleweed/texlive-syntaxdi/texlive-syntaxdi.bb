SUMMARY = "Create 'railroad' syntax diagrams"
DESCRIPTION = "This package provides TikZ styles for creating special syntax \
diagrams known as 'railroad' diagrams. The package was \
originally distributed as part of the schule bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.2svn56685"

RPM_NAME = "texlive-syntaxdi-2023.209.0.0.8.2svn56685-58.1.noarch.rpm"
RPM_HASH = "a9034dc5943ca55af656338b45f98da2cf0730aca5faa4787d99bd309785f6ee8fbb56a80a6810fc9040918e6b6ef7b22e802a39952c23398f6432dc62a69bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntaxdi.sty \
texlive-syntaxdi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
