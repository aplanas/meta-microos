SUMMARY = "Spreadsheet features for LaTeX tabular environments"
DESCRIPTION = "The package allows the user to construct tables in a manner \
similar to a spreadsheet. The cells of a table have row and \
column indices and these can be used in formulas to generate \
values in other cells."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn50147"

RPM_NAME = "texlive-spreadtab-2023.209.0.0.5svn50147-58.1.noarch.rpm"
RPM_HASH = "3f7d36fe2377508ac885daf6608b86fe213cd49b5855f1d087235e4cfb8e74ae69508f06065269dda68a3bfa8fe71c9c60e12a0fe15a9b59eab0e5533ae7b91e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spreadtab.sty \
texlive-spreadtab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-xfp.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
