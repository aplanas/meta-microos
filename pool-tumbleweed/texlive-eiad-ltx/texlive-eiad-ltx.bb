SUMMARY = "LaTeX support for the eiad font"
DESCRIPTION = "The package provides macros to support use of the eiad fonts in \
OT1 encoding. Also offered are a couple of Metafont files \
described in the font package, but not provided there."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "c8d60245e18bb8c626de3187553d2897594c528d25641e58e18ed9e2ca4175700cfb6687a8799e40742cd6d06356c906ec33743b05c8420424edf6ea7964ac18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eiad.sty \
texlive-eiad-ltx"

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
