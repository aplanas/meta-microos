SUMMARY = "Fonts for typesetting Tolkien Elvish scripts"
DESCRIPTION = "The bundle provides fonts for Cirth (cirth.mf, etc.) and for \
Tengwar (teng10.mf). The Tengwar fonts are supported by macros \
in teng.tex, or by the (better documented) tengtex package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-elvish-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "093c951884d8be751dd5177dc264fb1ca7b594c1e3d8203c9b55e81bae3f1a39fd16f06e420d210f98c41be33114c1369c95462fac2d4ced357be773f0af8535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cirth.tfm \
tex-teng10.tfm \
texlive-elvish"

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
