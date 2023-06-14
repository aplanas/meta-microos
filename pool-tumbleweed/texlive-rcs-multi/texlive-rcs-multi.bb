SUMMARY = "Typeset RCS version control in multiple-file documents"
DESCRIPTION = "The package enables the user to typeset version control \
information provided by RCS keywords (e.g., $ID: ... $) in \
LaTeX documents that contain multiple TeX files. The package is \
based on the author's svn-multi package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-2023.201.0.0.1asvn64967-53.1.noarch.rpm"
RPM_HASH = "e73b5cd33764f10b74eee655e3998a0c6e51f569584ca0684067613b5cc15f3e0f69c5da6e83f1c608649291d166dfc5af92aa11cfbe6ef75096ce786d8e052d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcs-multi.sty \
texlive-rcs-multi"

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
