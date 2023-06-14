SUMMARY = "Babel/Polyglossia support for Friulan(Furlan)"
DESCRIPTION = "The package provides a language description file that enables \
support of Friulan either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn39861"

RPM_NAME = "texlive-babel-friulan-2023.201.1.3svn39861-53.1.noarch.rpm"
RPM_HASH = "ffe8c78b726a9d8a941a7023aa27a9154b02a7e1c94bc3345883b5be08d37a2ffc10e92b7134cefa11020877084c89aa44fc1b73df27589d2225ebe14f4b8ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-friulan.ldf \
texlive-babel-friulan"

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
