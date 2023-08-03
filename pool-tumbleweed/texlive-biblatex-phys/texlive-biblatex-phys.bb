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

PV = "2023.209.1.1bsvn55643"

RPM_NAME = "texlive-biblatex-phys-2023.209.1.1bsvn55643-54.1.noarch.rpm"
RPM_HASH = "caa101db275558cb6f626f8f50cf1504b376bb128dc992a7a8a1206b69da02d11fc4f49e4e329e1c48cac74452407e681669e3ad07b9a263e4cbb9178fa30b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phys.bbx \
tex-phys.cbx \
texlive-biblatex-phys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
