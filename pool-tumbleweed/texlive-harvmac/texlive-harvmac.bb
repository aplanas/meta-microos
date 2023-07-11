SUMMARY = "Macros for scientific articles"
DESCRIPTION = "Known as 'Harvard macros', since written at that University."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harvmac-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "23cd7edeebdb13b7c13c7d2185e6374b8844f21b69bf373c5e6fedc60b8d9f373d5dc2fcf3731237940635e0f07a30798a21a367d8ab57c494c1cf408ca9227b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvmac.tex \
texlive-harvmac"

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
