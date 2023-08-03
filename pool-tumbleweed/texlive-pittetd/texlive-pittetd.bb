SUMMARY = "Electronic Theses and Dissertations at Pitt"
DESCRIPTION = "A document class for theses and dissertations. Provides patch \
files that enable pittetd to use files prepared for use with \
the pittdiss or pitthesis classes. The manual provides a \
detailed guide for users who wish to use the class to prepare \
their thesis or dissertation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.618svn15878"

RPM_NAME = "texlive-pittetd-2023.209.1.618svn15878-52.1.noarch.rpm"
RPM_HASH = "53d5fcf48bca51db541efbd89f092d5acae6318e6ed11fd6964d06496c8681dc891c7896d98273660ea0d125a703231284474cd57ed7748fb0ce40e78aeeaa21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pitetd10.clo \
tex-pitetd11.clo \
tex-pitetd12.clo \
tex-pittetd.cls \
texlive-pittetd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
