SUMMARY = "Fix uneven spacing around ellipses in LaTeX text mode"
DESCRIPTION = "This is a simple package that fixes a problem in the way LaTeX \
handles ellipses: it always puts a tiny bit more space after \
\\dots in text mode than before it, which results in the \
ellipsis being off-center when used between two words."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn55418"

RPM_NAME = "texlive-ellipsis-2023.201.1.8svn55418-53.2.noarch.rpm"
RPM_HASH = "2e0c91885c312c516da37b71b729b6d81e7499bef4e3ba539be9dea4a09bec7c99c20996cf8f79e892937f58f002d13d3f9494abb4e32949a6563abdcd51edd8"
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
