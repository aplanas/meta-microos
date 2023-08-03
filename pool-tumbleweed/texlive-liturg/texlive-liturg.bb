SUMMARY = "Support for typesetting Catholic liturgical texts"
DESCRIPTION = "The packages offers simple macros for typesetting Catholic \
liturgical texts, particularly Missal and Breviary texts. The \
package assumes availability of Latin typesetting packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-liturg-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "d39d98750fe47e03c52f53875e70db2df496020a34a6b0dd64332038ac0a8835271df3085ce32928ca6b5f504a7b119d4c77ba3e38bff2b87de6fee158fcb957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-liturg.sty \
texlive-liturg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-color.sty \
tex-ecclesiastic.sty \
tex-lettrine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
