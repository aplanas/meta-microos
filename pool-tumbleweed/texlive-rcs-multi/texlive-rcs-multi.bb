SUMMARY = "Typeset RCS version control in multiple-file documents"
DESCRIPTION = "The package enables the user to typeset version control \
information provided by RCS keywords (e.g., $ID: ... $) in \
LaTeX documents that contain multiple TeX files. The package is \
based on the author's svn-multi package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-2023.209.0.0.1asvn64967-54.1.noarch.rpm"
RPM_HASH = "9ca692397cac29caa2a84eccd0230753ad6837dc961f637b3606f0e591afcc7157f39a86bc6a28b2ec09a3fa1a996954d6e0cc9317a5b4e7f036ae4ae1952ff1"
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
