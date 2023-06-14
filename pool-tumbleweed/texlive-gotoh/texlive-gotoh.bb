SUMMARY = "An implementation of the Gotoh sequence alignment algorithm"
DESCRIPTION = "This package calculates biological sequence alignment with the \
Gotoh algorithm. The package also provides an interface to \
control various settings including algorithm parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44764"

RPM_NAME = "texlive-gotoh-2023.201.1.1svn44764-53.1.noarch.rpm"
RPM_HASH = "766af7b6a15c7cd0ecc23e45b13217f9357ca87ffa8741ec2f99c5f6217d9783e91f2109fe0a3ca3803742bdcf35d32bc24c9a3876fc96c2de0de24125ab3de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gotoh.sty \
texlive-gotoh"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
