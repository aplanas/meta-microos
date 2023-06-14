SUMMARY = "'Poor man's' graphics"
DESCRIPTION = "A set of extensions to LaTeX picture environment, including a \
wider range of vectors, and a lot more box frame styles."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pmgraph-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "66ba0c7faefedf83b034dba095fef0de24ec6a62045ccbcb3364acb618974e29c56eef59a3b5ba67b7bed7e9649932f9f3007f9c1e0d6543544619b2e458a30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmgraph.sty \
texlive-pmgraph"

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
