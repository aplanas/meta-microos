SUMMARY = "Babel support for Finnish"
DESCRIPTION = "The package provides a language description file that enables \
support of Finnish with babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3ssvn57643"

RPM_NAME = "texlive-babel-finnish-2023.209.1.3ssvn57643-54.1.noarch.rpm"
RPM_HASH = "6fe360233b06a834598ab20ec92ef47f59debb26e83e234db0a9060dcc54790bf31da12e6935a39f4c5d99735e7028bd0f8d3948aee1ca2bbcafac4b33bec2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-finnish.ldf \
texlive-babel-finnish"

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
