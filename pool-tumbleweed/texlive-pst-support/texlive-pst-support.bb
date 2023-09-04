SUMMARY = "Assorted support files for use with PSTricks"
DESCRIPTION = "An appropriate set of job options, together with process \
scripts for use with TeXnicCenter/"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pst-support-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "a8acd4ac20a68868d9f0a0f9e6ea1239bf636c7cb4dc2c08550c7495506f7ea80084ddcc49367f00453713568d74d7bd42bc37e592f9621d5f4876b0fd6d0f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-support"

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
