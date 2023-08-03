SUMMARY = "Support for Thai within babel"
DESCRIPTION = "The package provides support for typesetting Thai text. within \
the babel system."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn30564"

RPM_NAME = "texlive-babel-thai-2023.209.1.0.0svn30564-54.1.noarch.rpm"
RPM_HASH = "e798ce6c8697fd91ec39619121966f1c5444653491165b9cf78810e3f4e04b1cd4d7f9534e48e5ef681bd70521107d0f5429e0117986bf722488faf7d622d81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lthenc.def \
tex-thai.ldf \
tex-tis620.def \
texlive-babel-thai"

RDEPENDS:${PN} += "/usr/bin/sh \
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
