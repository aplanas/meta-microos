SUMMARY = "Support for Thai within babel"
DESCRIPTION = "The package provides support for typesetting Thai text. within \
the babel system."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn30564"

RPM_NAME = "texlive-babel-thai-2023.201.1.0.0svn30564-53.1.noarch.rpm"
RPM_HASH = "fa4551cf198fc67890207f5eb425fa29249c9560e334e5aa8f975755a114540518fee3fc7a4645b0d4c1029cabfa4dc2f93ac35e349ede7d1d0fee874cf0cd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lthenc.def) \
tex(thai.ldf) \
tex(tis620.def) \
texlive-babel-thai"

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
