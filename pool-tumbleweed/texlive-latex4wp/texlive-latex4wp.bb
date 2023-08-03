SUMMARY = "A LaTeX guide specifically designed for word processor users"
DESCRIPTION = "'LaTeX for Word Processor Users' is a guide that helps \
converting knowledge and techniques of word processing into the \
LaTeX typesetting environment. It aims at helping WP users use \
LaTeX instead."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.1.0.10svn35999"

RPM_NAME = "texlive-latex4wp-2023.209.1.0.10svn35999-55.1.noarch.rpm"
RPM_HASH = "e0c46e0af5f2f03416c285f58e7ee03620610722e02b3cb00344bb7fc736b94eb23c385835d11c16314a18479db04c9522532f20ebe9c2e2c0dae1962637022b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4wp"

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
