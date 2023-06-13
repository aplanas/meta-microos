SUMMARY = "LaTeX checker"
DESCRIPTION = "Lacheck is a tool for finding common mistakes in LaTeX \
documents. The distribution includes sources, and executables \
for OS/2 and Win32 environments."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-lacheck-2023.201.svn66186-55.1.noarch.rpm"
RPM_HASH = "f1c4f741defc03e2d7a2e80d00bbbadb0871eb72a27c1bcddb0971d62c1064fe5410289d056dea6bd98625adee3efa63793bf526ef36c719ff2d41929ef7bcff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(lacheck.1) \
texlive-lacheck"

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
texlive-lacheck-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
