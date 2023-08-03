SUMMARY = "Font installation guide"
DESCRIPTION = "This guide discusses the most common scenarios you are likely \
to encounter when installing Type 1 PostScript fonts. While the \
individual tools employed in the installation process are \
documented well, the actual difficulty most users are facing \
when trying to install new fonts is understanding how to put \
all the pieces together. This is what this guide is about."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.2.14svn59755"

RPM_NAME = "texlive-fontinstallationguide-2023.209.2.14svn59755-53.1.noarch.rpm"
RPM_HASH = "2ee9b43b8595ddf8d519c84c4138385c6f135a748d63003da5ff9cca37f19c922af5bc44173e2a5db9ea9c551d51f6cf312981dbc60b6d79f5b05e3b1ded3243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontinstallationguide"

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
