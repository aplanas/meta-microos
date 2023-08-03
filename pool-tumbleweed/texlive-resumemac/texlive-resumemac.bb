SUMMARY = "Plain TeX macros for resumes"
DESCRIPTION = "A set of macros is provided, together with an file that offers \
an example of use."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-resumemac-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "5d6edb302980fe6423a93f2c8cbb6f364f4e2b90d1375635af0f6485b2edc4e24f29efd198a7b317a5852f60a52c7be664906add193ab4cf8815af232abbabc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumemac.tex \
texlive-resumemac"

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
