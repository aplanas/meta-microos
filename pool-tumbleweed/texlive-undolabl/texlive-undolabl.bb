SUMMARY = "Override existing labels"
DESCRIPTION = "The package allows the user to override existing labels (for \
example, those generated automatically)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0msvn65846"

RPM_NAME = "texlive-undolabl-2023.209.1.0msvn65846-54.1.noarch.rpm"
RPM_HASH = "18a874b79fd1846cba62d63789873280efd3417836b25306854bfcc25b339a6b12c7bf2a408a7108b339a89160ed0f6f602840d36de6c6dda873dfa1b9e650ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-undolabl.sty \
texlive-undolabl"

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
