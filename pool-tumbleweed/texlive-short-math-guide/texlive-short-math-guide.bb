SUMMARY = "Guide to using amsmath and related packages to typeset mathematical notation with LaTeX"
DESCRIPTION = "The Short Math Guide is intended to be a concise introduction \
to the use of the facilities provided by amsmath and various \
other LaTeX packages for typesetting mathematical notation. \
Originally created by Michael Downes of the American \
Mathematical Society based only on amsmath, it has been brought \
up to date with references to related packages and other useful \
information."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn46126"

RPM_NAME = "texlive-short-math-guide-2023.201.2.0svn46126-53.1.noarch.rpm"
RPM_HASH = "e318c80e1b78ad48aada630983e898a0cfbdb16ebbd23c8f8dae5ff0588739f18160dfb76f16ee70c35f2d42ec99197fb6bc5a6083b226e33636e333596f0fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-short-math-guide"

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
