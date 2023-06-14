SUMMARY = "Expanded description environments"
DESCRIPTION = "The package provides additional features for the LaTeX \
description environment, including adjustable left margin. The \
package also allows the user to 'break' a list (for example, to \
interpose a comment) without affecting the structure of the \
list (this works for itemize and eumerate lists and numbered \
lists remain in sequence)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn15878"

RPM_NAME = "texlive-expdlist-2023.201.2.4svn15878-52.1.noarch.rpm"
RPM_HASH = "4b4607ef2d5b1cde76b5255fb5e9e2ac32732ce8ac927e33d743884553db38895fa374f9e9f006b9a472d7fc83b59b0b9f911c6f4cff303237b59db7d4477fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expdlist.sty \
texlive-expdlist"

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
