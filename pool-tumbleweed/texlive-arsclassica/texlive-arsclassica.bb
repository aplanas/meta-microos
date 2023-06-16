SUMMARY = "A different view of the ClassicThesis package"
DESCRIPTION = "The package changes some typographical points of the \
ClassicThesis style, by Andre Miede. It enables the user to \
reproduce the look of the guide The art of writing with LaTeX \
(the web page is in Italian)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45656"

RPM_NAME = "texlive-arsclassica-2023.201.svn45656-53.1.noarch.rpm"
RPM_HASH = "cff14d82049ccb9b10ba8432bca9f0f31faf9bc685c5fd9757f1fa51bab89bce5b9b52d58cf1d9e12cda0bf5ea1b4ae6c604aa86281f4cccc06e69cdbe429ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arsclassica.sty \
texlive-arsclassica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-classicthesis.sty \
tex-soul.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
