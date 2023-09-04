SUMMARY = "Create CJK character calligraphy practicing sheets"
DESCRIPTION = "This is a LaTeX package for creating CJK character calligraphy \
practicing sheets (copybooks). Currently, only XeTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn60676"

RPM_NAME = "texlive-zitie-2023.209.1.4.0svn60676-53.2.noarch.rpm"
RPM_HASH = "7815aa29dcdd1f72e653dbe007b6bb842ba72ed221ee5f0d2f345ef2f4593e5dae68bf4cb770ee7c8e07f25f2172da805cff806527da9a6e22c23c2179562b9b"
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
