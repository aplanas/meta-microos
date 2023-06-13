SUMMARY = "A BibLaTeX implementation of the AIP and APS bibliography style"
DESCRIPTION = "The package provides an implementation of the bibliography \
styles of both the AIP and the APS for BibLaTeX. This \
implementation follows standard BibLaTeX conventions, and can \
be used simply by loading BibLaTeX with the appropriate option: \
\\usepackage[style=phys]{biblatex} A demonstration database is \
provided to show how to format input for the style. Style \
options are provided to cover the minor formatting variations \
between the AIP and APS bibliography styles."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn55643"

RPM_NAME = "texlive-biblatex-phys-2023.201.1.1bsvn55643-53.1.noarch.rpm"
RPM_HASH = "d36d10005499657f932e4d47567816d2fe0075fb62358eb79eb65cfcbafa3e1eae8b1637d7aa4996d63338b8a3dfae3604f48929ffc97c6361767b66c93ef4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phys.bbx) \
tex(phys.cbx) \
texlive-biblatex-phys"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(numeric-comp.bbx) \
tex(numeric-comp.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
