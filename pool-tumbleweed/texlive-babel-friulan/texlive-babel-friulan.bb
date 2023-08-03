SUMMARY = "Babel/Polyglossia support for Friulan(Furlan)"
DESCRIPTION = "The package provides a language description file that enables \
support of Friulan either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn39861"

RPM_NAME = "texlive-babel-friulan-2023.209.1.3svn39861-54.1.noarch.rpm"
RPM_HASH = "b13130dfa70f2e6f0015c57fd00c9ddddeaf9a1a33a46c558199e1d2d0de9b1bd16b104ed8c3701ecb315594fd59c7c1f7c202c155a18222e69d7686abf4e21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-friulan.ldf \
texlive-babel-friulan"

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
