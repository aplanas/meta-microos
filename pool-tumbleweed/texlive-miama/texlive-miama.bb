SUMMARY = "The Miama Nueva handwriting font with LaTeX support"
DESCRIPTION = "Miama Nueva is a handwriting / script font with over 1300 \
glyphs that supports latin, cyrillic, and greek. It comes \
complete with LaTeX support."
LICENSE = "OFL-1.1"

PV = "2023.209.1.1svn54512"

RPM_NAME = "texlive-miama-2023.209.1.1svn54512-55.1.noarch.rpm"
RPM_HASH = "27bbde28e17ea8899b60371d108b21b0d5f82ba0693b6a5e298226277a9f9cd31690d3b8b9c3253e9c7bfb69906c6b656c32e67903b908f55edada36af9d180a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lgr-miama.enc \
tex-lgrfmm.fd \
tex-miama-lgr.tfm \
tex-miama-ot1.tfm \
tex-miama-qx.tfm \
tex-miama-t1.tfm \
tex-miama-t2a.tfm \
tex-miama-t2b.tfm \
tex-miama-t2c.tfm \
tex-miama-t5.tfm \
tex-miama-x2.tfm \
tex-miama.map \
tex-miama.sty \
tex-ot1-miama.enc \
tex-ot1fmm.fd \
tex-qx-miama.enc \
tex-qxfmm.fd \
tex-t1-miama.enc \
tex-t1fmm.fd \
tex-t2a-miama.enc \
tex-t2afmm.fd \
tex-t2b-miama.enc \
tex-t2bfmm.fd \
tex-t2c-miama.enc \
tex-t2cfmm.fd \
tex-t5-miama.enc \
tex-t5fmm.fd \
tex-x2-miama.enc \
tex-x2fmm.fd \
texlive-miama"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-miama-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
