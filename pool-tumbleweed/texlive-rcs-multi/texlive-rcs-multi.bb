SUMMARY = "Typeset RCS version control in multiple-file documents"
DESCRIPTION = "The package enables the user to typeset version control \
information provided by RCS keywords (e.g., $ID: ... $) in \
LaTeX documents that contain multiple TeX files. The package is \
based on the author's svn-multi package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-2023.209.0.0.1asvn64967-54.2.noarch.rpm"
RPM_HASH = "a18f418066a01206eac27c1058ef73014ebabce50651c5bd8abe32ca6a25d938e764d85c720200641539d40b77e0b7fd5d43f8ec289cda95ef30c863cd334c25"
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
