SUMMARY = "Font installation guide"
DESCRIPTION = "This guide discusses the most common scenarios you are likely \
to encounter when installing Type 1 PostScript fonts. While the \
individual tools employed in the installation process are \
documented well, the actual difficulty most users are facing \
when trying to install new fonts is understanding how to put \
all the pieces together. This is what this guide is about."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.2.14svn59755"

RPM_NAME = "texlive-fontinstallationguide-2023.201.2.14svn59755-52.1.noarch.rpm"
RPM_HASH = "c172e2f5b59bca8b345969fc016f2c3c4addbd348e299ba9dbe1e3c545724a05fedf4b00529c6a2eb8fd4ca709c977065d8f3f69e56200cb24fd88b0167a10d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontinstallationguide"

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
