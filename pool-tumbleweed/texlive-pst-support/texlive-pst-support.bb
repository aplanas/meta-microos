SUMMARY = "Assorted support files for use with PSTricks"
DESCRIPTION = "An appropriate set of job options, together with process \
scripts for use with TeXnicCenter/"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pst-support-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "03ea4b2c5e28a99590c6899c75f6880feaa010652a8bfee044f43489bbdc8bb337b371747e07b334c841e7f9f70a2aa40a56a2c04177a6ee8132a629d54f7c5b"
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
