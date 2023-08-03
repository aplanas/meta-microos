SUMMARY = "Manual change markup"
DESCRIPTION = "The package allows the user to manually markup changes of text, \
such as additions, deletions, or replacements. Changed text is \
shown in a different color; deleted text is striked out. \
Additionally, text can be highlighted and/or commented. The \
package allows free definition of additional authors and their \
associated color. It also allows you to change the markup of \
changes, authors, highlights or comments. A Python script is \
provided for removing the changes."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2.1svn59950"

RPM_NAME = "texlive-changes-2023.209.4.2.1svn59950-53.1.noarch.rpm"
RPM_HASH = "86d6cee0831d4c4b1b41f6bedec99c116acf470b618bd030ccd8126b581005ff51359578d77711eb6ea0b826399abf80827795a793c83f4524704a3cea309881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changes.sty \
texlive-changes"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-todonotes.sty \
tex-truncate.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
