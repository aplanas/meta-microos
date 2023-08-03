SUMMARY = "Make eqnarray behave like align"
DESCRIPTION = "The package makes eqnarray environment behave like align from \
amsmath'. It is intended for quick-fixing documents that use \
eqnarray. In cases where it fails, manual conversion to align \
is required, but these cases should be seldom."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-2023.209.1.0asvn43278-54.1.noarch.rpm"
RPM_HASH = "c22c7f35c66ac8e06aafd9a1b153dad8b187fff6e88858c35a1ff0ae44722898d8d037addfcf9eabd61a152dfa74db70e09ea509822d972a786c49dbfb31d86c"
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
