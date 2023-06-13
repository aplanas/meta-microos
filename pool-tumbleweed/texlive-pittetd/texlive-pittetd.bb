SUMMARY = "Electronic Theses and Dissertations at Pitt"
DESCRIPTION = "A document class for theses and dissertations. Provides patch \
files that enable pittetd to use files prepared for use with \
the pittdiss or pitthesis classes. The manual provides a \
detailed guide for users who wish to use the class to prepare \
their thesis or dissertation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.618svn15878"

RPM_NAME = "texlive-pittetd-2023.201.1.618svn15878-51.1.noarch.rpm"
RPM_HASH = "c05f421f27dc1ab28a19deb1d1d6b12be90a505f9d0030f3f3930980b61e655a423cc858f486ef0537ae47e41aa083c4dff350eeb745116dc55b4b522c1949d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pitetd10.clo) \
tex(pitetd11.clo) \
tex(pitetd12.clo) \
tex(pittetd.cls) \
texlive-pittetd"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
