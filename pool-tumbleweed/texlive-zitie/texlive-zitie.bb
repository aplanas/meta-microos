SUMMARY = "Create CJK character calligraphy practicing sheets"
DESCRIPTION = "This is a LaTeX package for creating CJK character calligraphy \
practicing sheets (copybooks). Currently, only XeTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn60676"

RPM_NAME = "texlive-zitie-2023.201.1.4.0svn60676-52.2.noarch.rpm"
RPM_HASH = "b3238491401351ca5de6f9bce83e65dfe0fdfcf2774c9f5ff6f9f218ba9e0d15250af40512322d1826127a0944b2e2382f8dc54701c8c88ef0a8ffde665e02fc"
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
