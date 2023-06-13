SUMMARY = "A minimalistic presentation theme for LaTeX Beamer"
DESCRIPTION = "The main features of this minimalistic Beamer theme are: Easily \
use own logos. Customizable. Looks good in a 4:3 and 16:9 \
aspect ratio, without the need to change anything. Provides an \
environment for vertically-spaced items. Provides light and \
dark mode. Is designed to be purely minimalistic without any \
distractions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.0svn56934"

RPM_NAME = "texlive-beamertheme-pure-minimalistic-2023.201.2.0.0svn56934-53.1.noarch.rpm"
RPM_HASH = "479ea79d41c8509e6720b281620b4d9e796a55c9375b6db3d92ec4c674fac9784d7e470f00e0997feecaf8bec61f08f3367e8c5fafd74b1dbd2c41112d52f9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemepureminimalistic.sty) \
tex(beamerfontthemepureminimalistic.sty) \
tex(beamerinnerthemepureminimalistic.sty) \
tex(beamerouterthemepureminimalistic.sty) \
tex(beamerthemepureminimalistic.sty) \
texlive-beamertheme-pure-minimalistic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(FiraMono.sty) \
tex(FiraSans.sty) \
tex(calc.sty) \
tex(etoolbox.sty) \
tex(fontenc.sty) \
tex(iftex.sty) \
tex(ifthen.sty) \
tex(noto.sty) \
tex(silence.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
