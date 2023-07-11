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

RPM_NAME = "texlive-gothic-2023.201.svn49869-53.2.noarch.rpm"
RPM_HASH = "8158b16aad3e42616a13cf7804ef5a78e7421a09a36593437352da86c4330f3220748c4cd449cb76a24268463d273a44e635277c27a47e3f1a30850d768978ab"
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
