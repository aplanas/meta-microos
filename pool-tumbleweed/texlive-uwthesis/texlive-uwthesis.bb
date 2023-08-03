SUMMARY = "University of Washington thesis class"
DESCRIPTION = "The uwthesis package"
LICENSE = "Apache-1.0"

PV = "2023.209.6.13svn15878"

RPM_NAME = "texlive-uwthesis-2023.209.6.13svn15878-54.1.noarch.rpm"
RPM_HASH = "e6335a56ecbe4cc4aac6b0971aafdb10be8e48e95640bb5c13c0424e81eae5341558f28650d333ce677811b9b96fb268b00ecf57d5eacf2dce842448488bd659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwthesis.cls \
texlive-uwthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
