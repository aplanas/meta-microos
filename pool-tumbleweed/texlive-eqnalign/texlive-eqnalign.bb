SUMMARY = "Make eqnarray behave like align"
DESCRIPTION = "The package makes eqnarray environment behave like align from \
amsmath'. It is intended for quick-fixing documents that use \
eqnarray. In cases where it fails, manual conversion to align \
is required, but these cases should be seldom."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-2023.209.1.0asvn43278-54.2.noarch.rpm"
RPM_HASH = "73e4759994d6884b9fe374f052ce27a24ef5c1085ea7713301a1c5f8b1c97b0822c6dd9d9529e2ddfcf19d6f767d30d0d1ff61e3c44b3a8964c863eab123b86d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnalign.sty \
texlive-eqnalign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
