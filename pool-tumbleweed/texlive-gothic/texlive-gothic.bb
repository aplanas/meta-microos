SUMMARY = "A collection of old German-style fonts"
DESCRIPTION = "A collection of fonts that reproduce those used in 'old German' \
printing and handwriting. The set comprises Gothic, Schwabacher \
and Fraktur fonts, a pair of handwriting fonts, Sutterlin and \
Schwell, and a font containing decorative initials. In \
addition, there are two re-encoding packages for Haralambous's \
fonts, providing T1, using virtual fonts, and OT1 and T1, using \
Metafont."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49869"

RPM_NAME = "texlive-gothic-2023.209.svn49869-54.2.noarch.rpm"
RPM_HASH = "07238bf3228ba97c796294bc3b3e7cb1606680f599646ac77aad08203b9207e962a0d0f5c8aae11eeb10b1e34d12bb12d8509b46ebaf066bb551b62ad73d5636"
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
