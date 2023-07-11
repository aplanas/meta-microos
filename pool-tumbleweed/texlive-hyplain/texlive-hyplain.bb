SUMMARY = "Basic support for multiple languages in Plain TeX"
DESCRIPTION = "The package offers a means to set up hyphenation suitable for \
several languages and/or dialects, and to select them or switch \
between them while typesetting."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-hyplain-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "7ff3174776524170ce0f31c22a7ee70bfbca6ddafeae7241efeebcd938b93b0ca0ada964d43d6b4575429db21422916df1533706c2d319b68fae59b3a6fb7a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hylang.tex \
tex-hyplain.tex \
tex-hyrules.tex \
texlive-hyplain"

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
