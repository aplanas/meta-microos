SUMMARY = "A front-end to fontspec, for selected fonts with math support"
DESCRIPTION = "This package facilitates the use of fontspec for users who do \
not wish to bother with details, with a special focus on \
quality fonts supporting Mathematics."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn65439"

RPM_NAME = "texlive-fontsetup-2023.201.1.4svn65439-52.1.noarch.rpm"
RPM_HASH = "b3fd704ad81c566ae2b26cc8f6099ec5ba75ca57b3c64bb729596e5c1255c1de1446fc039d71ec9eb7b41fea898b6684b2e73b35f43e65c11a34c3914d7cb444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fontsetup.sty) \
tex(fspconcrete.sty) \
tex(fspdefault.sty) \
tex(fspebgaramondot.sty) \
tex(fspfiraot.sty) \
tex(fspgfsartemisiaot.sty) \
tex(fspgfsdidotclassicot.sty) \
tex(fspgfsdidotot.sty) \
tex(fspgfsneohellenicot.sty) \
tex(fspkerkisot.sty) \
tex(fspneoeulerot.sty) \
tex(fspolddefault.sty) \
tex(fspoldstandard.sty) \
tex(fspstixtwoot.sty) \
tex(fsptalos.sty) \
tex(fsptimesot.sty) \
tex(fspxcharter.sty) \
texlive-fontsetup"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(ifthen.sty) \
tex(libertinus-otf.sty) \
tex(ucharclasses.sty) \
tex(unicode-math.sty) \
tex(xcharter-otf.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
