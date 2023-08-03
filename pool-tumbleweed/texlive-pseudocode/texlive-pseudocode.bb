SUMMARY = "LaTeX environment for specifying algorithms in a natural way"
DESCRIPTION = "This package provides the environment 'pseudocode' for \
describing algorithms in a natural manner."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-pseudocode-2023.209.svn54080-53.1.noarch.rpm"
RPM_HASH = "a2d2ff0c50f19c688050b17b1e0141c3fdf283a00d40e35171fd7c807120669fb36e7c56aa7effaaf619900302b638cee4385495d86dd79aaed3cbbbee7cc604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pseudocode.sty \
texlive-pseudocode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
