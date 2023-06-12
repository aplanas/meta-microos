SUMMARY = "Fix uneven spacing around ellipses in LaTeX text mode"
DESCRIPTION = "This is a simple package that fixes a problem in the way LaTeX \
handles ellipses: it always puts a tiny bit more space after \
\\dots in text mode than before it, which results in the \
ellipsis being off-center when used between two words."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn55418"

RPM_NAME = "texlive-ellipsis-2023.201.1.8svn55418-53.1.noarch.rpm"
RPM_HASH = "ee4fb3aa30f5647fabe14082840b050fa8d78989cfa5cdb1e4a356538ca6ddb1d72be95560c81a2b2fb1fb8fd9a0b79a3006d2f07bcc2819db4d540ca7e91e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ellipsis.sty) \
texlive-ellipsis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
