SUMMARY = "Footline selection and configuration for LaTeX beamer's standard themes"
DESCRIPTION = "This package is taking over, defining and redefining different \
footlines. Configuration is provided via using key-value \
syntax. It depends on the pgfkeys used for providing the \
configuration keys. Optional features require the following \
LaTeX packages: appendixnumberbeamer, calc, etoolbox, and \
numprint."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46494"

RPM_NAME = "texlive-hackthefootline-2023.201.svn46494-53.2.noarch.rpm"
RPM_HASH = "9f88d4aeae6251de7f72aaa02d8a70520151bef756522ef42ebe25458027169bb59a0f4732bbc94cdcc77f87b0413e86633b6fa7e91d378248626bd0f07b273f"
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
