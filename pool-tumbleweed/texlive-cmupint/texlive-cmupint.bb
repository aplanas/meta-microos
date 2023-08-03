SUMMARY = "Upright integral symbols for Computer Modern"
DESCRIPTION = "This package contains various upright integral symbols to match \
the Computer Modern font."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54735"

RPM_NAME = "texlive-cmupint-2023.209.1.1svn54735-54.1.noarch.rpm"
RPM_HASH = "3f3e984d6c079e99e2bfd0b5f68c9e514a7744e82d44fc023a7ef20a8ead93728d8e2d2ac70b8a0eb8111eda7db743a4d5761a1f5bdaef5639650fb2e67a16a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmupint.map \
tex-cmupint.sty \
tex-cmupint.tfm \
tex-ucmupint.fd \
texlive-cmupint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cmupint-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
