SUMMARY = "Use italic and upright greek letters with mathtime"
DESCRIPTION = "This package is an add-on to the MathTime a style to provide \
TeX support for the use of the MathTime(tm) fonts (formerly \
distributed by YandY, Inc.). The MathTime package has uppercase \
Greek letters hardwired to be upright and only upright; this \
package provides a switch to choose between the two kinds of \
Greek uppercase letters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1+svn17967"

RPM_NAME = "texlive-mtgreek-2023.201.1.1+svn17967-54.1.noarch.rpm"
RPM_HASH = "d4e4e2634b23afa5b547a0ca70215117ac7cf995fb3f4ef97a7339e1aa83e640c76b3db74b002779eed7de82104624ac3e80e4924d3835a5e9b885169302021f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mtgreek.sty) \
texlive-mtgreek"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
