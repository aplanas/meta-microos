SUMMARY = "Create dynamic online presentations with LaTeX"
DESCRIPTION = "TeXPower is a bundle of packages intended to provide an \
all-inclusive environment for designing pdf screen \
presentations to be viewed in full-screen mode, especially for \
projecting `online' with a video beamer. For some of its core \
functions, it uses code derived from ppower4 packages. It is, \
however, not a complete environment in itself: it relies on an \
existing class for preparing slides (such as foiltex or \
seminar) or another package such as pdfslide."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn29349"

RPM_NAME = "texlive-texpower-2023.209.0.0.2svn29349-55.1.noarch.rpm"
RPM_HASH = "2064e91d6f6ac64832bd4208bab013392021c02a7f994a57911d4276293b7e25b6468fa6eb6e7a8ba3785c0f0f804190a6217f6b38de8202ba9e681250172da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-automata.sty \
tex-fixseminar.sty \
tex-powersem.cls \
tex-texpower.sty \
tex-tpcolors.cfg \
tex-tplists.sty \
tex-tpoptions.cfg \
tex-tppstcol.sty \
tex-tpsem-a4.sty \
tex-tpsettings.cfg \
texlive-texpower"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-graphics.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-pstricks.sty \
tex-relsize.sty \
tex-sem-page.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tpslifonts"

inherit rpm
