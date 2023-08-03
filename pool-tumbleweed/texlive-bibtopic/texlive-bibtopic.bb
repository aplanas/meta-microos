SUMMARY = "Include multiple bibliographies in a document"
DESCRIPTION = "The package allows the user to include several bibliographies \
covering different 'topics' or bibliographic material into a \
document (e.g., one bibliography for primary literature and one \
for secondary literature). The package provides commands to \
include either all references from a .bib file, only the \
references actually cited or those not cited in your document. \
The user has to construct a separate .bib file for each \
bibliographic 'topic', each of which will be processed \
separately by BibTeX. If you want to have bibliographies \
specific to one part of a document, see the packages bibunits \
or chapterbib."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-bibtopic-2023.209.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "4757a7cbab5b2433806e4a232010ad87e9a1db9684fe034e4f7daaff98feb4d68e86cb5e3dae9c4c6e6be794b759e24c8a9d6f969bc3df98a77118ffabc9fe44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibtopic.sty \
texlive-bibtopic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
