SUMMARY = "Package for typesetting arabic exam scripts"
DESCRIPTION = "The package provides a modified version of the exam package \
made compatible with XeLaTeX/polyglossia to typesetting arabic \
exams."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn46628"

RPM_NAME = "texlive-sexam-2023.201.1svn46628-53.1.noarch.rpm"
RPM_HASH = "d097a23bcec5907c8e0fa8b3b4442ca394081edf844409295b70f86cb163517d843b345d7ef3ffed9164a1acc2d87649fbff1a6dd91fb2835af572fda2300c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bacex.sty) \
tex(sexam.sty) \
tex(wexam.sty) \
texlive-sexam"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(background.sty) \
tex(bclogo.sty) \
tex(ean13isbn.sty) \
tex(etoolbox.sty) \
tex(fancybox.sty) \
tex(fmtcount.sty) \
tex(fouriernc.sty) \
tex(geometry.sty) \
tex(listings.sty) \
tex(mathpple.sty) \
tex(mathrsfs.sty) \
tex(mathtools.sty) \
tex(moreenum.sty) \
tex(multicol.sty) \
tex(pifont.sty) \
tex(polyglossia.sty) \
tex(setspace.sty) \
tex(tikz.sty) \
tex(ulem.sty) \
tex(wasysym.sty) \
tex(yagusylo.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
