SUMMARY = "Add picture to title page of a document"
DESCRIPTION = "The package allows you to place a picture on the title page \
(cover page) of a LaTeX document. Example of usage: \
\\usepackage[cc]{titlepic} \\usepackage{graphicx} \
\\titlepic{\\includegraphics[width=\\textwidth]{picture.png}} The \
package currently only works with the document classes article, \
report and book."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn43497"

RPM_NAME = "texlive-titlepic-2023.209.1.2svn43497-53.1.noarch.rpm"
RPM_HASH = "7e0e62d851679e9733706322051af8786296bfcbb15491482478abbe13147bde032cd414b5cb175720fe09a264762b04c64c874b74dfc6a189f696d4f1e0aa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlepic.sty \
texlive-titlepic"

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
