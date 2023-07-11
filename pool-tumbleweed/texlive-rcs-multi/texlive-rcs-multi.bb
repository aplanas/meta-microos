SUMMARY = "Typeset RCS version control in multiple-file documents"
DESCRIPTION = "The package enables the user to typeset version control \
information provided by RCS keywords (e.g., $ID: ... $) in \
LaTeX documents that contain multiple TeX files. The package is \
based on the author's svn-multi package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-2023.201.0.0.1asvn64967-53.2.noarch.rpm"
RPM_HASH = "621b78435b6c1d3e87936cf28afdecbc7c560fa90346de20f57708b61c0426ef915f4add8357b5b27eebcaa8df0efc1fb7246a2aaf17eabfc094b8ca6993048e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcs-multi.sty \
texlive-rcs-multi"

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
