SUMMARY = "TrueType version of Chinese Arphic fonts"
DESCRIPTION = "This package provides TrueType versions of the Chinese Arphic \
fonts for use with XeLaTeX and LuaLaTeX. Type1 versions of \
these fonts, for use with pdfLaTeX and the cjk package, are \
provided by the arphic package. Arphic is actually the name of \
the company which created these fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42675"

RPM_NAME = "texlive-arphic-ttf-2023.201.svn42675-53.1.noarch.rpm"
RPM_HASH = "81f10e424352b0028e4557c1871daadac7d49f6e5c2aa242e523d9de2f94cac5549a079e422ca0fff011db8df7ac6d3acee8a5b6ccd4ce0c20277fe71268fd02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-ttf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-arphic-ttf-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
