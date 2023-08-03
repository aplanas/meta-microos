SUMMARY = "MetaPost output of Go positions"
DESCRIPTION = "The package allows you to draw Go game positions with MetaPost. \
Two methods of usage are provided, either using the package \
programmatically, or using the package via a script (which may \
produce several images)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn15878"

RPM_NAME = "texlive-metago-2023.209.0.0.9svn15878-55.1.noarch.rpm"
RPM_HASH = "5925951ecbdbecd1197190cdf14e4c63edf9aa4595886e1adb54ff92459d11869f120ff7ef98f2e99e832f76fd710b2378fdddfdae8c06616fa0b2d09b99cc32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metago"

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
