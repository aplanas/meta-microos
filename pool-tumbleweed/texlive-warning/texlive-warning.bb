SUMMARY = "Global warnings at the end of the logfile"
DESCRIPTION = "This package provides a command that generates a list of \
warnings that are printed out at the very end of the logfile. \
This is useful for warnings such as 'Rerun for this or that \
reason' or 'This is a draft, change it before the final run'."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn22028"

RPM_NAME = "texlive-warning-2023.209.0.0.01svn22028-54.1.noarch.rpm"
RPM_HASH = "4e6f730419646e92728ae943a6b2ddfa9595ba52e5a62245cd2d6175f08b3d660052c2a6443b32ad69902ae4e4e5bd1e96da87fd9758fa0f575ab2028ec430b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-warning.sty \
texlive-warning"

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
