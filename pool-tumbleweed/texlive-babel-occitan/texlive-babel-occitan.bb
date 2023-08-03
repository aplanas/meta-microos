SUMMARY = "Babel support for Occitan"
DESCRIPTION = "Occitan language description file with usage instructions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn39608"

RPM_NAME = "texlive-babel-occitan-2023.209.0.0.2svn39608-54.1.noarch.rpm"
RPM_HASH = "38b880d19ef5860805703ec2299f71a432aaa9b382776649e24310fd8fd8698af37f917035f863b4b6bf9cd76919246afa2745a3562796686b75e7570c4f55a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-occitan.ldf \
texlive-babel-occitan"

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
