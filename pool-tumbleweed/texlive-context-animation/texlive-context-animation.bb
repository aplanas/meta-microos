SUMMARY = "Generate fieldstack based animation with ConTeXt"
DESCRIPTION = "The package is a port, to Context (mkvi), of the corresponding \
LaTeX package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-animation-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "713ca0759264b0c0a23f0f6d60164080c7e21cbd63efed31a5ed375943cb59e410bf3541f8f37441ab0122f95c20f8ace92b6e619d4b18d6b01d68c8742b35b9"
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
