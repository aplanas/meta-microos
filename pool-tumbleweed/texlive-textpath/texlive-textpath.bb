SUMMARY = "Setting text along a path with MetaPost"
DESCRIPTION = "This MetaPost package provides macros to typeset text along a \
free path with the help of LaTeX, thereby preserving kerning \
and allowing for 8-bit input (accented characters)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn15878"

RPM_NAME = "texlive-textpath-2023.201.1.6svn15878-54.1.noarch.rpm"
RPM_HASH = "4fd4aec9f5f45fc24f3c71b82d5103721aba54ea905be5d29500e414804720d8dfabcf762fbc1448b5044869fefa38c5be270559529c4f85fddfbfca78617049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textpathmp.sty \
texlive-textpath"

RDEPENDS:${PN} += "/bin/sh \
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
