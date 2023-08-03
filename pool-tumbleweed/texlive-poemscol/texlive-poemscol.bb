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

PV = "2023.209.3.1415926svn56082"

RPM_NAME = "texlive-poemscol-2023.209.3.1415926svn56082-53.1.noarch.rpm"
RPM_HASH = "0a35c4ef52bfb05ebf85b7301bb59beeae20ad51678b85eb4edb59b1474500a455c37dfd07ef027696ff39eb008c154b6228eaf3d683e3b91f77b6ef142d53e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poemscol.sty \
texlive-poemscol"

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
