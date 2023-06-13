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

PV = "2023.201.2.19svn66455"

RPM_NAME = "texlive-biber-2023.201.2.19svn66455-53.1.noarch.rpm"
RPM_HASH = "1fbfd31f7808e324d6b4e3b55f2b3125a845c074ed14c3b15cff4fd12b49d1a12324038eda3bc22f7a341ee0f63be79728368b2251a2f0183dbe7359f7fc66ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber"

RDEPENDS:${PN} += "/bin/sh \
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
