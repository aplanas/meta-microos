SUMMARY = "Creating Venn diagrams with MetaPost"
DESCRIPTION = "MetaPost macros for venn diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-venn-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "9832fe4e5f93b9e53dbe3e3d9c22de0f4ede21bd171849bc3b249fdc4c35df5ecb5873b9be8ee7891bd48190902d518f9d8de5a0498b52bd51fe7ea9871851d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venn"

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
