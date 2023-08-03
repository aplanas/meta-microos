SUMMARY = "Coptic fonts and LaTeX macros for general usage and for philology"
DESCRIPTION = "CBcoptic is a bundle of files for typesetting Coptic \
philological text with the proper fonts and hyphenation. The \
fonts are based on, but much extend, the fonts of the original \
coptic bundle. The CBcoptic bundle includes font description \
files, Metafont sources and equivalent Adobe Type 1 fonts in \
pfb format. The bundle also includes a package that provides \
some macros of philological interest."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn16666"

RPM_NAME = "texlive-cbcoptic-2023.209.0.0.2svn16666-53.1.noarch.rpm"
RPM_HASH = "33362d3221453391d170fe38df4ce978970bcf76794400391f5e05125f95425b4e7fecfb524a046ab1bc743ed80391ead0016847c4a1a8deb4d7b9db0a9a9158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copti.tfm \
tex-coptic.sty \
tex-copto.tfm \
tex-lcopcoptic.fd \
tex-prnthyph.sty \
texlive-cbcoptic"

RDEPENDS:${PN} += "/usr/bin/sh \
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
