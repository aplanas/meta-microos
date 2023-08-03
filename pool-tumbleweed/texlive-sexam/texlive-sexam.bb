SUMMARY = "Package for typesetting arabic exam scripts"
DESCRIPTION = "The package provides a modified version of the exam package \
made compatible with XeLaTeX/polyglossia to typesetting arabic \
exams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn46628"

RPM_NAME = "texlive-sexam-2023.209.1svn46628-54.1.noarch.rpm"
RPM_HASH = "ce8eb7bd8ba877d88ee4291b8653073469c44ee1e6bde3d4f77f452fd0a3452a489fe4b4bd255aa17c4313fd41aca527c5c133103e07a279212ac7cc39dc734f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bacex.sty \
tex-sexam.sty \
tex-wexam.sty \
texlive-sexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-background.sty \
tex-bclogo.sty \
tex-ean13isbn.sty \
tex-etoolbox.sty \
tex-fancybox.sty \
tex-fmtcount.sty \
tex-fouriernc.sty \
tex-geometry.sty \
tex-listings.sty \
tex-mathpple.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-moreenum.sty \
tex-multicol.sty \
tex-pifont.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-wasysym.sty \
tex-yagusylo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
