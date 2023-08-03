SUMMARY = "The TeX Directory Structure standard"
DESCRIPTION = "Defines a structure for placement of TeX-related files on an \
hierarchical file system, in a way that is well-defined, and is \
readily implementable."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64477"

RPM_NAME = "texlive-tds-2023.209.1.1svn64477-55.1.noarch.rpm"
RPM_HASH = "02f977013ceab309357ced3a26ac47b3e43880236b49ef5aa34c307447c46ef68a203af86c1453556fb82ecc472d40dfdf8e447498deffd303f42905dfc389fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tds"

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
