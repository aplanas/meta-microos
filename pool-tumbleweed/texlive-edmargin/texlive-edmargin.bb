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

PV = "2023.201.1.2svn27599"

RPM_NAME = "texlive-edmargin-2023.201.1.2svn27599-53.2.noarch.rpm"
RPM_HASH = "20b2fcd4afae5e47ad3539ad2be588faa58418119f41de398ce366c462403c4634eb23703b0873beaca62eb3f22ee1ded90b6111a6b5c727927e42d1bf7fc69e"
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
