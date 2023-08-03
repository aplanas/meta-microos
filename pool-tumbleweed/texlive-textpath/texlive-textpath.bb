SUMMARY = "Setting text along a path with MetaPost"
DESCRIPTION = "This MetaPost package provides macros to typeset text along a \
free path with the help of LaTeX, thereby preserving kerning \
and allowing for 8-bit input (accented characters)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn15878"

RPM_NAME = "texlive-textpath-2023.209.1.6svn15878-55.1.noarch.rpm"
RPM_HASH = "dad2004bfc98d520a4993491500662ca280ebc1432508e814d4df886336223394070d973e6eda77fbbb3a4870889997cf9eb544d8cf68d919f28f6be310ceb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textpathmp.sty \
texlive-textpath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
