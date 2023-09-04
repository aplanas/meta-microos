SUMMARY = "Footline selection and configuration for LaTeX beamer's standard themes"
DESCRIPTION = "This package is taking over, defining and redefining different \
footlines. Configuration is provided via using key-value \
syntax. It depends on the pgfkeys used for providing the \
configuration keys. Optional features require the following \
LaTeX packages: appendixnumberbeamer, calc, etoolbox, and \
numprint."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46494"

RPM_NAME = "texlive-hackthefootline-2023.209.svn46494-54.2.noarch.rpm"
RPM_HASH = "901461928b7d520c017938f5c12041ccc53c5265a1f754221e02bbc6aa85bfd167f0accaa9c05a001d3b616fb16fdcfb6497be10a2c6f747d0af7b73b6c57413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hackthefootline.sty \
texlive-hackthefootline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-appendixnumberbeamer.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-numprint.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
