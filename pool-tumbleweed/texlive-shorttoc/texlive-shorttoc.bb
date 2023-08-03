SUMMARY = "Table of contents with different depths"
DESCRIPTION = "A package to create another table of contents with a different \
depth, useful in large documents where a detailed table of \
contents should be accompanied by a shorter one, giving only a \
general overview of the main topics in the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-shorttoc-2023.209.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "342bd44c5906a0f2056e12549e256599bb8a478fccae41e77233b74ce0b822dbb277111b96519377a6d57e19f0ea9371aeda479a3fc280c504f24ce2e825b9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shorttoc.sty \
texlive-shorttoc"

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
