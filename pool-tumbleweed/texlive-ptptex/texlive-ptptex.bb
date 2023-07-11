SUMMARY = "Macros for 'Progress of Theoretical Physics'"
DESCRIPTION = "The distribution contains the class (which offers an option \
file for preprints), and a template. The class requires the \
cite, overcite and wrapfig packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-2023.201.0.0.91svn19440-53.2.noarch.rpm"
RPM_HASH = "e570389dd8c1f71fb48d584cbdc5b7e0eac8d2827826cb580691aa6305844eedf2d621c208c2b99bdf3f60703ace7fb287d85b8c159ef3660fa4712c6d5e5625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptp-prep.clo \
tex-ptptex.cls \
tex-wrapft.sty \
texlive-ptptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-overcite.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
