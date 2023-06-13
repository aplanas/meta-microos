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

PV = "2023.201.1.1svn51825"

RPM_NAME = "texlive-fixcmex-2023.201.1.1svn51825-52.1.noarch.rpm"
RPM_HASH = "9f40288c90cbfbd699a45875c2c3da64d993793b5edbdb654133eaababe0f11c32c46ec17426e12b6ad3dbb03cd76f81644cd80c3c560635aab85f63aa3a66e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixcmex.sty) \
texlive-fixcmex"

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
