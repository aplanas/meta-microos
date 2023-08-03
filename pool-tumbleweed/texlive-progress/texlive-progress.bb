SUMMARY = "Creates an overview of a document's state"
DESCRIPTION = "Progress is a package which. when compiling TeX and LaTeX \
documents, generates a HTML file showing an overview of a \
document's state (of how finished it is). The report is sent to \
file \\ProgressReportName, which is by default the \\jobname with \
the date appended (but is user-modifiable)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn19519"

RPM_NAME = "texlive-progress-2023.209.1.10svn19519-53.1.noarch.rpm"
RPM_HASH = "385bde3fcee14203b0a1ca60b154b1f83c07485244e1c8c2014d44aab99654d704779508e45887d47ef16a360894a77422ace0604ecd8bbe2e7d73892bff2737"
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
