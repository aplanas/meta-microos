SUMMARY = "A collection of old German-style fonts"
DESCRIPTION = "A collection of fonts that reproduce those used in 'old German' \
printing and handwriting. The set comprises Gothic, Schwabacher \
and Fraktur fonts, a pair of handwriting fonts, Sutterlin and \
Schwell, and a font containing decorative initials. In \
addition, there are two re-encoding packages for Haralambous's \
fonts, providing T1, using virtual fonts, and OT1 and T1, using \
Metafont."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49869"

RPM_NAME = "texlive-gothic-2023.201.svn49869-53.1.noarch.rpm"
RPM_HASH = "a787e8613367ff3adbb686bc3933080bb95851ab4a4d6ed076941aacc7294d05b9f6af96202d8d8c0b6d84ca93559a87189a6d75760dde01a6b70b0519825fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmfrak.tfm \
tex-schwell.tfm \
tex-suet14.tfm \
tex-yfrak.tfm \
tex-ygoth.tfm \
tex-yinit.tfm \
tex-ysmfrak.tfm \
tex-yswab.tfm \
texlive-gothic"

RDEPENDS:${PN} += "/bin/sh \
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
