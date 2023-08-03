SUMMARY = "Map and iterate over LaTeX3 clists"
DESCRIPTION = "This package provides a key-based interface for defining \
templates whose job is to partition LaTeX3 clists and map \
differentiatedly across its components."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61811"

RPM_NAME = "texlive-clistmap-2023.209.1.2svn61811-54.1.noarch.rpm"
RPM_HASH = "88053dd1e7472ee69511ad0b777d63d66959ec8e2f7dc6329f699487095b2decbe20e1c6f29e5dc904d337144cc87ab2402ec043672514bfd15a2335bee2f2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clistmap.sty \
texlive-clistmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-erw-l3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
