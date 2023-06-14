SUMMARY = "Rotation of document elements"
DESCRIPTION = "The package is for rotation of document elements. It is a \
combination of the lscape package and an extension of the \
rotating package. The package is designed for use with the iso \
class but may be used with any normal class."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-isorot-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "b3b10365be143d125f31160ec88403f28bb34d7bc50c0c1504d11d518cbec38359327265337f35786a7666fccacf5713f52dea3fe5d603aac0065131477a0a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isorot.sty \
texlive-isorot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-lscape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
