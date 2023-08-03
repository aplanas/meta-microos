SUMMARY = "A package for creating tramlines (lines above and below a title used by lawyers in the UK)"
DESCRIPTION = "This package automatically creates tramlines (lines above and \
below a title used by lawyers in the UK and the Commonwealth)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65692"

RPM_NAME = "texlive-tramlines-2023.209.1.1.0svn65692-53.1.noarch.rpm"
RPM_HASH = "4f1fb2e8683ee8ca8ecf31a41f997052116af80a4a9e94858b13f48ff88291b74a1b2da71af12e161b21c60ad660719d29ff3d99b6e180a0691f4457e9b27db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tramlines.sty \
texlive-tramlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
