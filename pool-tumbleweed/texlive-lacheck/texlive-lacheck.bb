SUMMARY = "LaTeX checker"
DESCRIPTION = "Lacheck is a tool for finding common mistakes in LaTeX \
documents. The distribution includes sources, and executables \
for OS/2 and Win32 environments."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-lacheck-2023.209.svn66186-56.1.noarch.rpm"
RPM_HASH = "0b0c03c72b75461d6a686b299c69da017854c24b72a66f0ea21c0533bb7bb630b8cc3b394e6aeeb02bf12b3908be87d2237b331bae6de140eff5038a445fd5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-lacheck.1 \
texlive-lacheck"

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
texlive-lacheck-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
