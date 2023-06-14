SUMMARY = "Generate roman numerals instead of arabic digits"
DESCRIPTION = "The romannum package changes LaTeX generated numbers to be \
printed with roman numerals instead of arabic digits. It \
requires the stdclsdv package. Users of the bookhands fonts may \
find this package useful."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0bsvn15878"

RPM_NAME = "texlive-romannum-2023.201.1.0bsvn15878-53.1.noarch.rpm"
RPM_HASH = "aa0d7f79a6bdf28db45776449805b592119fac6a118c8c9feb4d7629364ab4c5e398a818719c240dc3b81163727ae914b17e701607978be4c113d8e417777408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romannum.sty \
texlive-romannum"

RDEPENDS:${PN} += "/bin/sh \
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
