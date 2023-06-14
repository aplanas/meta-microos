SUMMARY = "Combining package fancyhdr with KOMA-Script's scrlayer"
DESCRIPTION = "This LaTeX package uses KOMA-Script's scrlayer to redefine the \
page styles of package fancyhdr. This allows the combination of \
features of fancyhdr with features of scrlayer. Before \
KOMA-Script v3.33 scrlayer-fancyhdr was part of KOMA-Script \
itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn63844"

RPM_NAME = "texlive-scrlayer-fancyhdr-2023.201.0.0.2.2svn63844-53.1.noarch.rpm"
RPM_HASH = "9a08dc945abd43fc888162d0874150fb5048fd1452d1e40ed87da1f04c765a0b814acda5623d6f6bce4550f5a5296888aef31aa07325c78f5d829779c81de6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrlayer-fancyhdr.sty \
texlive-scrlayer-fancyhdr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-scrlayer.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
