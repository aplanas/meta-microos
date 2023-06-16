SUMMARY = "Make eqnarray behave like align"
DESCRIPTION = "The package makes eqnarray environment behave like align from \
amsmath'. It is intended for quick-fixing documents that use \
eqnarray. In cases where it fails, manual conversion to align \
is required, but these cases should be seldom."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-2023.201.1.0asvn43278-53.1.noarch.rpm"
RPM_HASH = "e91e70d5235f21fd6d98397e8e6c66321fce842aadf2fd583d1c3151fe138952392ff85abeff6c0b8ea142660f01c276c0050057d284119866f75144d34ef84d"
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
