SUMMARY = "Create CJK character calligraphy practicing sheets"
DESCRIPTION = "This is a LaTeX package for creating CJK character calligraphy \
practicing sheets (copybooks). Currently, only XeTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn60676"

RPM_NAME = "texlive-zitie-2023.209.1.4.0svn60676-53.1.noarch.rpm"
RPM_HASH = "4050045caff1b388dfe7f752dcc28557e93340fa6a991295856786ba6d31f392e09226b700e7fd9840c0f74461fcbeaa161b63ee2b5dcc093807117098ab490b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zitie.luatex.def \
tex-zitie.sty \
tex-zitie.xetex.def \
texlive-zitie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctex.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xeCJK.sty \
tex-xparse.sty \
tex-zhlipsum.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
