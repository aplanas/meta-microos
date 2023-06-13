SUMMARY = "Support for typesetting Catholic liturgical texts"
DESCRIPTION = "The packages offers simple macros for typesetting Catholic \
liturgical texts, particularly Missal and Breviary texts. The \
package assumes availability of Latin typesetting packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-liturg-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "5f6c879f397add02253f07c102929e034c8119cd025516e5cd1de52b2d8a21fc6e361068b9df5dea8ff600051031caf650aa7734385e27d816726a0e1fa4132c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(liturg.sty) \
texlive-liturg"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(color.sty) \
tex(ecclesiastic.sty) \
tex(lettrine.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
