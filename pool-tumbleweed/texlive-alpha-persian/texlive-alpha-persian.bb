SUMMARY = "Persian version of alpha.bst"
DESCRIPTION = "The package provides a Persian version of the alpha BibTeX \
style and offers several enhancements. It is compatible with \
the hyperref, url, natbib, and cite packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn66115"

RPM_NAME = "texlive-alpha-persian-2023.209.1.3svn66115-55.1.noarch.rpm"
RPM_HASH = "98a984e292a1589a6847d7fe89e6eeac6120d9744d0a0439948742f600a9a72bbf711d23b7858bc3e36387797871418d2ba4cb4f82f86a56fc7b91cec4746c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alpha-persian"

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
