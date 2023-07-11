SUMMARY = "Support for the EMF symbol"
DESCRIPTION = "This package provides LaTeX support for the symbol for the EMF \
in electric circuits and electrodynamics. It provides support \
for multiple symbols but does not provide any fonts. The fonts \
themselves must be aquired otherwise. However the fonts are \
part of a normal TeX Live installation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn42023"

RPM_NAME = "texlive-emf-2023.201.1svn42023-53.2.noarch.rpm"
RPM_HASH = "cd4cf04d98b2669d001402b516ff2c3220da04429ff6a17a11f2410bae7b91a574c3abbe4c449edc36e1460b2e9945d6be56f18a6880ddcd8aec24b3f2a65dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emf.sty \
texlive-emf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
