SUMMARY = "A summary list of PicTeX documentation"
DESCRIPTION = "A summary of available resources providing (or merely \
discussing) documentation of PicTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24927"

RPM_NAME = "texlive-doc-pictex-2023.201.svn24927-52.1.noarch.rpm"
RPM_HASH = "e9647390fc2cfc559e0d00748aabe2b7ce4b63c83e6bda7d2f9c24368bad577b0f5ac404b930c9e1dc548e428c3d1125b206b5a354b82a94de4c005bd020c334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doc-pictex"

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
