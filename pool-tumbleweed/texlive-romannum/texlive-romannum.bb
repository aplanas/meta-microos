SUMMARY = "Generate roman numerals instead of arabic digits"
DESCRIPTION = "The romannum package changes LaTeX generated numbers to be \
printed with roman numerals instead of arabic digits. It \
requires the stdclsdv package. Users of the bookhands fonts may \
find this package useful."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0bsvn15878"

RPM_NAME = "texlive-romannum-2023.209.1.0bsvn15878-54.1.noarch.rpm"
RPM_HASH = "49bba6ad4573f2f11d8b95ed6c70a0d95f32041c89e055207e55d97995547a7718fe3e65b8b67281bd6f398fe6fbad15e83d765c14258e9acbc14d00f35ba172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romannum.sty \
texlive-romannum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-stdclsdv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
