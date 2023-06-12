SUMMARY = "A LaTeX guide specifically designed for word processor users"
DESCRIPTION = "'LaTeX for Word Processor Users' is a guide that helps \
converting knowledge and techniques of word processing into the \
LaTeX typesetting environment. It aims at helping WP users use \
LaTeX instead."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.0.10svn35999"

RPM_NAME = "texlive-latex4wp-2023.201.1.0.10svn35999-54.1.noarch.rpm"
RPM_HASH = "3076cfd89f4900e47ec9c05033ad7ff75e395e1ca4b87e8abf5ed1bebd4036abbba692ce590154f3252276e8ef1bb22f96dd0c58df81e62f9f35af6ceb3faa86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4wp"
RDEPENDS:${PN} += "/bin/sh \
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
