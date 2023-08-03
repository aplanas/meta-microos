SUMMARY = "Introduction to LaTeX in Portuguese"
DESCRIPTION = "This is the Portuguese translation of A Short Introduction to \
LaTeX2e."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.5.01.0svn55643"

RPM_NAME = "texlive-lshort-portuguese-2023.209.5.01.0svn55643-55.1.noarch.rpm"
RPM_HASH = "630b49f7c87e348df836d6e8d515cf83ca684fe47f23a31c3293f9dd5262b45c84d29000ff4a213d5df7fa22360b9641a86d356fcb87844b22a59b13b3a86bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-portuguese"

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
