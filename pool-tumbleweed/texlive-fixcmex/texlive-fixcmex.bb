SUMMARY = "Fully scalable version of Computer Modern Math Extension font"
DESCRIPTION = "This package provides a fully scalable version of the Computer \
Modern Math Extension font for curing sizing problems mainly \
with lmodern. It can be used when the main font of the document \
is Computer Modern (or European Modern, if T1 encoding is \
selected), or Latin Modern. It redefines the math extension \
font so that it becomes arbitrarily scalable, using the optical \
size fonts provided by the AMS together with the original \
cmex10 font."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51825"

RPM_NAME = "texlive-fixcmex-2023.209.1.1svn51825-53.1.noarch.rpm"
RPM_HASH = "bc3f93b4f6c0c33ab0f5cfc13e2c743b0d2dd122f207ecdcebdfa39a8a8a82c34d155b7c4ddf5251a4091a693168ce7023a2d949096a9c253f36eb0072c1414f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixcmex.sty \
texlive-fixcmex"

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
