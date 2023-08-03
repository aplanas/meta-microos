SUMMARY = "Fix uneven spacing around ellipses in LaTeX text mode"
DESCRIPTION = "This is a simple package that fixes a problem in the way LaTeX \
handles ellipses: it always puts a tiny bit more space after \
\\dots in text mode than before it, which results in the \
ellipsis being off-center when used between two words."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn55418"

RPM_NAME = "texlive-ellipsis-2023.209.1.8svn55418-54.1.noarch.rpm"
RPM_HASH = "ba75f1fd3497244c980ec45298cea6219210aad486713287bc2d2e68b3f79d8d98c125f94630e914354dcb0ebd4afdd3a829327525f8fa823f8fac2e0a8ef359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipsis.sty \
texlive-ellipsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
