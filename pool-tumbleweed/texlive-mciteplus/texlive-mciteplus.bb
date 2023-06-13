SUMMARY = "Enhanced multiple citations"
DESCRIPTION = "The mciteplus LaTeX package is an enhanced reimplementation of \
Thorsten Ohl's mcite package which provides support for the \
grouping of multiple citations together as is often done in \
physics journals. An extensive set of features provide for \
other applications such as reference sublisting."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn31648"

RPM_NAME = "texlive-mciteplus-2023.201.1.2svn31648-52.1.noarch.rpm"
RPM_HASH = "8076a7e0a8c0295ae2412f842a04d169ead9fad951c54705598aedabdf442be9faa35c1a7fae0e0154e5b58a799f1d8ada1d8bdac4ed283de97bb88824661334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mciteplus.sty) \
texlive-mciteplus"

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
