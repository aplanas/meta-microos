SUMMARY = "Mathematics in Greek texts"
DESCRIPTION = "This package has been designed to facilitate the use of Greek \
letters in mathematical mode. The package allows one to \
directly type in Greek letters (in ISO 8859-7 encoding) in math \
mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-elmath-2023.209.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "80e965035d892a175aa541bc5e24c09fcdbaebfcc7b290243ddc868b63ba1aeb3dad20d647a6037791acff99499902791b93e93e94bed0199a49234d992cbdeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elmath.sty \
texlive-elmath"

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
