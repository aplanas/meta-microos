SUMMARY = "Crossreferences within documents"
DESCRIPTION = "The package defines cross-references (essentially 'grand' label \
references), which may be listed in a table of \
cross-references."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-crossreference-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "22e20fad861c57ff41d6c543e6779d73a2fcc3ad0d4fb4f565a379ab1c927480a4d793bbdf187be0c0165c3b719b1c720c33aca59d7dbe43aa5e89c59d1f883e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossreference.sty \
texlive-crossreference"

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
