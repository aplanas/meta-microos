SUMMARY = "UIUC thesis class"
DESCRIPTION = "The class produces a document that conforms to the format \
described in the University's Handbook for Graduate Students \
Preparing to Deposit."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.25svn15878"

RPM_NAME = "texlive-uiucthesis-2023.201.2.25svn15878-53.1.noarch.rpm"
RPM_HASH = "b4797385e153be0f102d6043ef79b268233b95d0f402b4de3414f8be5eb32bbd9c6ccdd869f256b35e285b32ba3bfa3d47838428aea9035e9704742297027166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uiucthesis.cls) \
tex(uiucthesis.sty) \
texlive-uiucthesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(book.cls) \
tex(setspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
