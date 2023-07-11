SUMMARY = "Set up Japanese font families for XeLaTeX"
DESCRIPTION = "The zxjafont package"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62864"

RPM_NAME = "texlive-zxjafont-2023.201.1.3svn62864-52.2.noarch.rpm"
RPM_HASH = "ae71bb69a6fcb5e7c03ce88e9132fbf322745e3527cb26d907aaef0cb52873e524bee88ac684aca4bd5cd03ce4dec4d00f21f71f7a8058ff943d51a7fa874804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafont.sty \
texlive-zxjafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
