SUMMARY = "Letters to multiple recipients"
DESCRIPTION = "A package for multiple letters from the same basic source; the \
package offers parametrisation of the letters actually sent."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.3svn21480"

RPM_NAME = "texlive-formlett-2023.209.2.3svn21480-53.1.noarch.rpm"
RPM_HASH = "24f95e57e737cbb8e738dc01cbb99510a6f9e2b8d6eaf54c151da4231a075345fccda7b8021c51364d2300b6224b3fcea24265adff0719d546826aa9a01311ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formlett.sty \
texlive-formlett"

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
