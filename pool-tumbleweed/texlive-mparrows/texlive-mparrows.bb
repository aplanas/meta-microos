SUMMARY = "MetaPost module with different types of arrow heads"
DESCRIPTION = "A package to provide different types of arrow heads to be used \
with MetaPost commands drawarrow and drawdblarrow commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.1svn39729"

RPM_NAME = "texlive-mparrows-2023.209.0.0.1svn39729-55.1.noarch.rpm"
RPM_HASH = "b0e12ce34adc62d373261be208f590722af354ba47d88cb75ab3a5e3431c3ded9f61df39afb2f6f74d23c10a8dc672826be00d47a58ca130cb78bb5756b6102f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparrows"

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
