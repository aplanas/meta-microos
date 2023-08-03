SUMMARY = "BibTeX style for Frontiers in Bioscience"
DESCRIPTION = "A BibTeX style file made with custom-bib to fit Frontiers in \
Bioscience requirements: all authors, no et al, full author \
names, initials abbreviated; only abbreviated journal name \
italicised, no abbreviation dots; only year, no month, at end \
of reference; and DOI excluded, ISSN excluded."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fbs-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "46a51f2787a35c049c0b09176e9997e430fb7fb092154260466e15b980d91ed738f3d614eb0b9e59632c787f144943a00e02778b460d064a84e8448349d540b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbs"

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
