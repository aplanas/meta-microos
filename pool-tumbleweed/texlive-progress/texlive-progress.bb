SUMMARY = "Creates an overview of a document's state"
DESCRIPTION = "Progress is a package which. when compiling TeX and LaTeX \
documents, generates a HTML file showing an overview of a \
document's state (of how finished it is). The report is sent to \
file \\ProgressReportName, which is by default the \\jobname with \
the date appended (but is user-modifiable)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn19519"

RPM_NAME = "texlive-progress-2023.201.1.10svn19519-52.1.noarch.rpm"
RPM_HASH = "134827d84ea0b19b1512c2d93f8dca9d8f2719b271f1b9ede7e4489504b8676d81f65c5d90bca706ab95d6962c96cd67867e3f8092c92a7ee32ff185a6d07bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-progress.sty \
texlive-progress"

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
