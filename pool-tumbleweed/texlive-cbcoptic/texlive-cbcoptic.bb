SUMMARY = "Coptic fonts and LaTeX macros for general usage and for philology"
DESCRIPTION = "CBcoptic is a bundle of files for typesetting Coptic \
philological text with the proper fonts and hyphenation. The \
fonts are based on, but much extend, the fonts of the original \
coptic bundle. The CBcoptic bundle includes font description \
files, Metafont sources and equivalent Adobe Type 1 fonts in \
pfb format. The bundle also includes a package that provides \
some macros of philological interest."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn16666"

RPM_NAME = "texlive-cbcoptic-2023.201.0.0.2svn16666-52.1.noarch.rpm"
RPM_HASH = "969143534772261e2c302c0f5a5e71f816106baac5a2ea0f97013adc146a028bf611d0bdeb2c2c15cf0b7eedb6b4c8e73ed0212a7600a382090863963c40e60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copti.tfm \
tex-coptic.sty \
tex-copto.tfm \
tex-lcopcoptic.fd \
tex-prnthyph.sty \
texlive-cbcoptic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
texlive \
texlive-cbcoptic-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
