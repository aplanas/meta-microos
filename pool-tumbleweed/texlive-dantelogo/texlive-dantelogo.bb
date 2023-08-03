SUMMARY = "A font for DANTE's logo"
DESCRIPTION = "The DANTE font for the logo of DANTE (http://www.dante.de), the \
German speaking TeX users group. The font includes only the \
five characters d, a, n, t, and e. dantelogo.sty provides an \
interface for LuaLaTeX/XeLaTeX/pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-2023.209.0.0.03svn38599-55.1.noarch.rpm"
RPM_HASH = "31e6e825614005334491cfaa3842822c9010456035bd605d8153cbdcb6f7174555f6ca43eb0b05d1e87dbbd9b1b96e3e8ae656f7ae2b052da89a041934726b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DANTE-Bold--texnansx--base.tfm \
tex-DANTE-Bold--texnansx.tfm \
tex-DANTE-Bold--texnansx.vf \
tex-DANTE-Bold-Italic--texnansx--base.tfm \
tex-DANTE-Bold-Italic--texnansx.tfm \
tex-DANTE-Bold-Italic--texnansx.vf \
tex-DANTE-Bold.tfm \
tex-DANTE-Italic--texnansx--base.tfm \
tex-DANTE-Italic--texnansx.tfm \
tex-DANTE-Italic--texnansx.vf \
tex-DANTE.tfm \
tex-OT1DANTE.fd \
tex-T1DANTE.fd \
tex-dante.enc \
tex-dante.map \
tex-dantelogo.sty \
texlive-dantelogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-dantelogo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
