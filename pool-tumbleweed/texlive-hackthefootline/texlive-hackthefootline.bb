SUMMARY = "Footline selection and configuration for LaTeX beamer's standard themes"
DESCRIPTION = "This package is taking over, defining and redefining different \
footlines. Configuration is provided via using key-value \
syntax. It depends on the pgfkeys used for providing the \
configuration keys. Optional features require the following \
LaTeX packages: appendixnumberbeamer, calc, etoolbox, and \
numprint."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46494"

RPM_NAME = "texlive-hackthefootline-2023.209.svn46494-54.1.noarch.rpm"
RPM_HASH = "4ea7402991dac99492b60aa9e374485d485597e20fd078f69d13f5d88e44fbd8a69870997a814235fd73a59334d55e340f7fe996a111bc35adc556c5d2f988a0"
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
