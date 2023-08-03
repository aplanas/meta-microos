SUMMARY = "Guide to using amsmath and related packages to typeset mathematical notation with LaTeX"
DESCRIPTION = "The Short Math Guide is intended to be a concise introduction \
to the use of the facilities provided by amsmath and various \
other LaTeX packages for typesetting mathematical notation. \
Originally created by Michael Downes of the American \
Mathematical Society based only on amsmath, it has been brought \
up to date with references to related packages and other useful \
information."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn46126"

RPM_NAME = "texlive-short-math-guide-2023.209.2.0svn46126-54.1.noarch.rpm"
RPM_HASH = "d15fede38e93ee29679f0ff048b72591e443210f2de0cf03f2e9c644b7bfac43dc82f488a020a31936c3059967f5958ecc17f291cfeeda2f7a30b8d6360ff6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-short-math-guide"

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
