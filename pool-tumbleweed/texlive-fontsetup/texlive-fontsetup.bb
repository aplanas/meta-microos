SUMMARY = "A front-end to fontspec, for selected fonts with math support"
DESCRIPTION = "This package facilitates the use of fontspec for users who do \
not wish to bother with details, with a special focus on \
quality fonts supporting Mathematics."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn65439"

RPM_NAME = "texlive-fontsetup-2023.209.1.4svn65439-53.1.noarch.rpm"
RPM_HASH = "ba1631726b6f360eaedfbf9899e6961e3b5d919d9cec840bea593fb7114866ab1bfecc5103ebe32770396e12cb76ff7046ecc55b47eb3bc8bec0a7a8c8dd1857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontsetup.sty \
tex-fspconcrete.sty \
tex-fspdefault.sty \
tex-fspebgaramondot.sty \
tex-fspfiraot.sty \
tex-fspgfsartemisiaot.sty \
tex-fspgfsdidotclassicot.sty \
tex-fspgfsdidotot.sty \
tex-fspgfsneohellenicot.sty \
tex-fspkerkisot.sty \
tex-fspneoeulerot.sty \
tex-fspolddefault.sty \
tex-fspoldstandard.sty \
tex-fspstixtwoot.sty \
tex-fsptalos.sty \
tex-fsptimesot.sty \
tex-fspxcharter.sty \
texlive-fontsetup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-libertinus-otf.sty \
tex-ucharclasses.sty \
tex-unicode-math.sty \
tex-xcharter-otf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
