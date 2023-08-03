SUMMARY = "Process reStructuredText with ConTeXt"
DESCRIPTION = "The package provides a converter and module for typesetting \
reStructuredText with ConTeXt. The module uses several lua \
scripts in doing its work. Documentation is supplied in rst, \
which seems to be readable as text, but ...."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-rst-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "d0de58a0d475fd9d4a020594a84f27210c32313f5017197cb171188bbe5383710205a221ef09438a5a5e883418fecfaf6db828286305c7943ccaffa885f0b137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-rst"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
