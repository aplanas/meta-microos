SUMMARY = "Natbib citations with PDF tooltips"
DESCRIPTION = "This LaTeX package uses pdfcomment and bibentry to surround \
natbib citations with PDF tooltips."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-2023.209.1.1svn50449-53.1.noarch.rpm"
RPM_HASH = "be28235c4837fa128d0e12ab8aaf3d2e26e08585eca62bf345d960f46fcf4cb1aba0b33f743f498fafb6709a4481c067d82e10ccfc08ef7197ba06afcf3c25ed"
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
