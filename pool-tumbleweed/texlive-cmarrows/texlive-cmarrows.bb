SUMMARY = "MetaPost arrows and braces in the Computer Modern style"
DESCRIPTION = "This MetaPost package contains macros to draw arrows and braces \
in the Computer Modern style."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn24378"

RPM_NAME = "texlive-cmarrows-2023.201.0.0.9svn24378-53.1.noarch.rpm"
RPM_HASH = "9101c09dd87ff8084e6fb64920b15b4ea26fb9f06662711849e8f9d2308241acbfe10d4d60a2b0b7b18e384fd2d35555ba59427133eccee815bc9f728911d6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmarrows"

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
