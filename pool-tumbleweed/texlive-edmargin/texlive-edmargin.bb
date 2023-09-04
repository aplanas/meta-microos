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

RPM_NAME = "texlive-edmargin-2023.209.1.2svn27599-54.2.noarch.rpm"
RPM_HASH = "cf58b22af9f2b4ceda4e4c2dcbfe6ff59f6a32ab3726faf45621b57279e2a7412d21678a2ac787ca81ebfbb507c26ef084bec9711969ca922ddeaae7ae878411"
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
