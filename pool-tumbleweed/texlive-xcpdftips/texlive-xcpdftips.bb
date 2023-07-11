SUMMARY = "Natbib citations with PDF tooltips"
DESCRIPTION = "This LaTeX package uses pdfcomment and bibentry to surround \
natbib citations with PDF tooltips."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-2023.201.1.1svn50449-52.2.noarch.rpm"
RPM_HASH = "cb9428af06f8099387660f802e8bcea15f23f3ec8c0772406ea78de4949bd04f25c7cd663f5ea426277998e34ecfd44f4772cb7afca4e41807ce5188e88692b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcpdftips.sty \
texlive-xcpdftips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibentry.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-linegoal.sty \
tex-ocgbase.sty \
tex-pdfbase.sty \
tex-pdfcomment.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
