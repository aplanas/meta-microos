SUMMARY = "Process reStructuredText with ConTeXt"
DESCRIPTION = "The package provides a converter and module for typesetting \
reStructuredText with ConTeXt. The module uses several lua \
scripts in doing its work. Documentation is supplied in rst, \
which seems to be readable as text, but ...."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-rst-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "09176b45ab4c256ef1a513105a8fd64e34092555ec27e9ed0919422cb7db433cc82a2414a584cafd2759cb22e8fc4196c03b80308e799335f3fdae41ee1ac432"
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
