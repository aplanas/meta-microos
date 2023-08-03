SUMMARY = "Multiple series of endnotes for critical editions"
DESCRIPTION = "Edmargin provides a very simple scheme for endnote sections for \
critical editions. Endnotes can either be marked in the text, \
or with marginal references to the page in the note sections \
where the note is to be found. Notes can be set in individual \
paragraphs, or in block paragraph mode (where there are many \
short notes). Note sections will have running headers of the \
form 'Textual notes to pp. xx--yy'. New note sections can be \
created on the fly. There are predefined endnote sections for \
textual notes, emendations, and explanatory notes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn27599"

RPM_NAME = "texlive-edmargin-2023.209.1.2svn27599-54.1.noarch.rpm"
RPM_HASH = "ee375209d5da13b99684b3cc6c62cb1fdcef89446ca6920190be98f39b116869e5f6ec26d743e14c20567991d3fda57aa4b4c0b6cf8dc2bbffa8b222ad995cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edmargin.sty \
texlive-edmargin"

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
