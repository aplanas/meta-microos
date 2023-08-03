SUMMARY = "TrueType version of Chinese Arphic fonts"
DESCRIPTION = "This package provides TrueType versions of the Chinese Arphic \
fonts for use with XeLaTeX and LuaLaTeX. Type1 versions of \
these fonts, for use with pdfLaTeX and the cjk package, are \
provided by the arphic package. Arphic is actually the name of \
the company which created these fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42675"

RPM_NAME = "texlive-arphic-ttf-2023.209.svn42675-54.1.noarch.rpm"
RPM_HASH = "9f12429596f7fa4020cc8485c6c30b093234dd49bc8b2dcf849ce4871ae6da4845b0eecd4bc1daf5da9db13e10aec5c5941584b73abe7c24cd5d4aeb2842417b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-ttf"

RDEPENDS:${PN} += "/usr/bin/sh \
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
