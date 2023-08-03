SUMMARY = "A commutative diagram package using LAMSTeX or Xy-pic fonts"
DESCRIPTION = "The pb-diagram package"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn15878"

RPM_NAME = "texlive-pb-diagram-2023.209.5.0svn15878-52.1.noarch.rpm"
RPM_HASH = "00046b4a48e49b952cf7e2c518df48bc8b195830d6aff81ebf1b13f53bab41c8c4bf4b59d2912c7a438cac0c36eabe5834f2ef7eefb5c026958303cd7ea4a723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lamsarrow.sty \
tex-pb-diagram.sty \
tex-pb-lams.sty \
tex-pb-xy.sty \
texlive-pb-diagram"

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
