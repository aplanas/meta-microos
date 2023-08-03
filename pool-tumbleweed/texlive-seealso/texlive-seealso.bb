SUMMARY = "Improve the performance of \\see macros with makeindex"
DESCRIPTION = "The package amends the \\see and \\seealso macros that are used \
in building indexes with makeindex, to deal with repetitions, \
and to ensure page numbers are present in the actual index \
entries. on these indirecty"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn43595"

RPM_NAME = "texlive-seealso-2023.209.1.2svn43595-54.1.noarch.rpm"
RPM_HASH = "9286c9292ebadb801632286a38d8ab7335472b5c12d98a98f3ade01787b9bfdaaec013008028465dc3ef68efb76abfe7605f873987b54172380004d808659f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seealso.sty \
texlive-seealso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
