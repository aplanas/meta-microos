SUMMARY = "Introduction to LaTeX in Thai"
DESCRIPTION = "This is the Thai translation of the Short Introduction to \
LaTeX2e."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.1.32svn55643"

RPM_NAME = "texlive-lshort-thai-2023.208.1.32svn55643-53.1.noarch.rpm"
RPM_HASH = "70a8b257e2fd8bfefdaae0a73b7d2335dd322dfc4d131f44873358aaf1fa1d60d2ae8e8556d44c92bae9aaa40cba0fa6149cc2b0020f742181b2e4ebe78367bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-thai"

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
