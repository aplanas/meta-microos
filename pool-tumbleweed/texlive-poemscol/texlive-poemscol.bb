SUMMARY = "Typesetting Critical Editions of Poetry"
DESCRIPTION = "The package offers LaTeX macros for typesetting critical \
editions of poetry. Its features include automatic \
linenumbering, generation of separate endnotes sections for \
emendations, textual collations, and explanatory notes, special \
marking for cases in which page breaks occur during stanza \
breaks, running headers of the form 'Notes to pp. xx-yy' for \
the notes sections, index of titles and first lines, and \
automatic generation of a table of contents."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926svn56082"

RPM_NAME = "texlive-poemscol-2023.201.3.1415926svn56082-52.1.noarch.rpm"
RPM_HASH = "ffcbb02b96f33d9c24a647835810721a1c4c923ff6c2e51892d490cac41a995a47b6087f79d6c387461b83a9356bb22fcc4311f1993228dfacaa6e7013fb3922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poemscol.sty \
texlive-poemscol"

RDEPENDS:${PN} += "/bin/sh \
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
