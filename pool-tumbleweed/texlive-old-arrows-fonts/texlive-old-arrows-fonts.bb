SUMMARY = "Severed fonts for texlive-old-arrows"
DESCRIPTION = "The  separated fonts package for texlive-old-arrows"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn42872"

RPM_NAME = "texlive-old-arrows-fonts-2023.201.2.0svn42872-54.1.noarch.rpm"
RPM_HASH = "7ce8dcc4772c9ffa956c73759c8edea01f1aa402c901c81b0a514936b1226c1dccc359e71204f2d0149f549748a52d5df7802c440eedcc12e0da6e4ee6b8ba41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-oldarrows \
texlive-old-arrows-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
