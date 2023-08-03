SUMMARY = "Multiple environments using a 'key=value' syntax"
DESCRIPTION = "The package provides a multienv environment which permits easy \
addition of multiple environments using a key=value syntax. \
Macros to define environments using this syntax are also \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64967"

RPM_NAME = "texlive-multienv-2023.209.1.0svn64967-55.1.noarch.rpm"
RPM_HASH = "93a45827e6ca8b66c0736b4ecfd34132d2932fd3bf79162a6ef21b2fc79f4703321299d66a21c2d313d228bc58a3eae4f80aaad4eb0c518f5575d132ddd5cd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multienv.sty \
texlive-multienv"

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
