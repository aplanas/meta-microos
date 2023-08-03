SUMMARY = "A sophisticated package for typesetting stage plays"
DESCRIPTION = "This package enables the user to typeset stage plays in a way \
that permits to create highly customized printouts for each \
actor."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn45363"

RPM_NAME = "texlive-theatre-2023.209.0.0.1svn45363-55.1.noarch.rpm"
RPM_HASH = "fb92ba05a2f1345f2880cc70b92a1924b4459d17e36bf4374ffd2c5b366ecb035818cd37bb41d07f3bed57aba1ce0bdef920872ffafc52d288429a68fe7d26ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theatre"

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
