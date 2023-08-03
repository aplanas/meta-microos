SUMMARY = "BibTeX support for HTML files"
DESCRIPTION = "Bibhtml consists of a Perl script and a set of BibTeX style \
files, which together allow you to output a bibliography as a \
collection of HTML files. The references in the text are linked \
directly to the corresponding bibliography entry, and if a URL \
is defined in the entry within the BibTeX database file, then \
the generated bibliography entry is linked to this. The package \
provides three different style files derived from each of the \
standard plain.bst and alpha.bst, as well as two style files \
derived from abbrv.bst and unsrt.bst (i.e., eight in total)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.2svn31607"

RPM_NAME = "texlive-bibhtml-2023.209.2.0.2svn31607-54.1.noarch.rpm"
RPM_HASH = "e111a2c245b0530529893a3bbea0116f9874190d04c177ee62f6224bda47ae4292a134e631183387e850317f7986acbcd1722e2d8ecafc53d76470e6cf501e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibhtml"

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
