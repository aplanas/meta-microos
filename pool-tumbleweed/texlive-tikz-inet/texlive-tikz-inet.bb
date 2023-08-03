SUMMARY = "Draw interaction nets with TikZ"
DESCRIPTION = "The package extends TikZ with macros to draw interaction nets."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-tikz-inet-2023.209.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "f65fd4c7565cbcad3fddf61750515466a3208d0f8f8d2b95e3145581fe062dd0ec6966bc1bcda818e8788a3fa9aeb79be38bb04c89c01f6403a643e99ec3f0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-inet.sty \
texlive-tikz-inet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
