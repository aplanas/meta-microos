SUMMARY = "Avoid widows"
DESCRIPTION = "This package provides a useful macro to manage widow lines."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24066"

RPM_NAME = "texlive-nowidow-2023.201.1.0svn24066-54.1.noarch.rpm"
RPM_HASH = "8975e1cc4b5ee7ab6f128c4efeaa747c684e98a5eeea490104690c96e1b8b9df388502fd06c7852ca7580ebc6208c3525d10752faf43ffcc0688503a4291e77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nowidow.sty \
texlive-nowidow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
