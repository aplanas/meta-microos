SUMMARY = "A BibTeX replacement for users of BibLaTeX"
DESCRIPTION = "Biber is a BibTeX replacement for users of BibLaTeX. Biber \
supports full UTF-8, can (re)-encode input and output, supports \
highly configurable sorting, dynamic bibliography sets and many \
other features. The CTAN distribution offers a compressed tar \
archive of the sources, etc., together with 'binary' \
distributions for a variety of platforms. Note: on SourceForge \
biber is formally named 'biblatex-biber', to distinguish it \
from an earlier (now apparently moribund) project called \
'biber'."
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2023.209.2.19svn66455"

RPM_NAME = "texlive-biber-2023.209.2.19svn66455-54.1.noarch.rpm"
RPM_HASH = "e65c37c89db701f38cf6343c1d07cf5d57a46a579bf46d430e2029999bce02ad08ef0fc1d12f98d32c8a1568c1d9ab42b17b5cabe339b5643fa0f58aa010c7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-biber-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
