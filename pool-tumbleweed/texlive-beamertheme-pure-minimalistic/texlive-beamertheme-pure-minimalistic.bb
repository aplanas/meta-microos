SUMMARY = "A minimalistic presentation theme for LaTeX Beamer"
DESCRIPTION = "The main features of this minimalistic Beamer theme are: Easily \
use own logos. Customizable. Looks good in a 4:3 and 16:9 \
aspect ratio, without the need to change anything. Provides an \
environment for vertically-spaced items. Provides light and \
dark mode. Is designed to be purely minimalistic without any \
distractions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.0svn56934"

RPM_NAME = "texlive-beamertheme-pure-minimalistic-2023.209.2.0.0svn56934-54.1.noarch.rpm"
RPM_HASH = "f1e132c589a9c83e3738f96280d17f3782494bac399496f4204ec1f2e2f875f32c06ea44d8690dd9f92952f2eb44690980c9e515b1ef747d890b0ecb5e368364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemepureminimalistic.sty \
tex-beamerfontthemepureminimalistic.sty \
tex-beamerinnerthemepureminimalistic.sty \
tex-beamerouterthemepureminimalistic.sty \
tex-beamerthemepureminimalistic.sty \
texlive-beamertheme-pure-minimalistic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-FiraSans.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-noto.sty \
tex-silence.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
