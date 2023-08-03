SUMMARY = "MetaPost arrows and braces in the Computer Modern style"
DESCRIPTION = "This MetaPost package contains macros to draw arrows and braces \
in the Computer Modern style."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn24378"

RPM_NAME = "texlive-cmarrows-2023.209.0.0.9svn24378-54.1.noarch.rpm"
RPM_HASH = "0b6671b7eb31c9a06b43a12e780427f1894e6bc54b3688802605f85494c1dc9cfcf29bb911639f1d7488e7004d7b648f394e74f341a1480e79fa44cdce1be328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmarrows"

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
