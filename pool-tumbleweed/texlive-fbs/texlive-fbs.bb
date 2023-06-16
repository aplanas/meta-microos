SUMMARY = "BibTeX style for Frontiers in Bioscience"
DESCRIPTION = "A BibTeX style file made with custom-bib to fit Frontiers in \
Bioscience requirements: all authors, no et al, full author \
names, initials abbreviated; only abbreviated journal name \
italicised, no abbreviation dots; only year, no month, at end \
of reference; and DOI excluded, ISSN excluded."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fbs-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "4958796b15a28ff207eaae5994304b6dc335625bbbe0078d0cbd07841972d2e7f7cbc631693bfe067514418f3775811c9d98d3fef0c572d218e4ce03fb91439b"
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
