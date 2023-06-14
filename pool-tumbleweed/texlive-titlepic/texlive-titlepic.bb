SUMMARY = "Add picture to title page of a document"
DESCRIPTION = "The package allows you to place a picture on the title page \
(cover page) of a LaTeX document. Example of usage: \
\\usepackage[cc]{titlepic} \\usepackage{graphicx} \
\\titlepic{\\includegraphics[width=\\textwidth]{picture.png}} The \
package currently only works with the document classes article, \
report and book."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn43497"

RPM_NAME = "texlive-titlepic-2023.201.1.2svn43497-52.1.noarch.rpm"
RPM_HASH = "ef3a10a54a34a4fe13501565307cb732f7a5a0107e30556948f921e550a272b6aab1facb5e0dd61b28d848f8a7a108b647e8276c55eea9aa4003a6a6f8b643c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlepic.sty \
texlive-titlepic"

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
