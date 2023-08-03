SUMMARY = "Obyknovennaya Novaya fonts"
DESCRIPTION = "The Obyknovennaya Novaya (Ordinary New Face) typeface was \
widely used in the USSR for scientific and technical \
publications, as well as textbooks. The fonts are encoded to \
KOI8-R (which is a long-established Russian font encoding, \
rather than a TeX/LaTeX encoding). To use the fonts, the user \
needs Cyrillic font support."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn33355"

RPM_NAME = "texlive-obnov-2023.209.0.0.11svn33355-55.1.noarch.rpm"
RPM_HASH = "b383390bd7051735e3fc51c485d71048b8dd5c9f9f969195b676e4b04199b18d1a64c9a0ffb1f327cfe98ff15ba323f04c84e627d6b58a6ec6d68a7a131be030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcywobn.fd \
tex-obn10.tfm \
tex-obn12.tfm \
tex-obn17.tfm \
tex-obn7.tfm \
tex-obnb10.tfm \
tex-obnb12.tfm \
tex-obnb17.tfm \
tex-obnb7.tfm \
tex-obnit10.tfm \
tex-obnit12.tfm \
tex-obnit17.tfm \
tex-obnit7.tfm \
tex-obnitb10.tfm \
tex-obnitb12.tfm \
tex-obnitb17.tfm \
tex-obnsc10.tfm \
tex-obnsc12.tfm \
tex-obnsc17.tfm \
tex-obnsc7.tfm \
tex-obnsl10.tfm \
tex-obnsl12.tfm \
tex-obnsl17.tfm \
tex-obnsl7.tfm \
texlive-obnov"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
