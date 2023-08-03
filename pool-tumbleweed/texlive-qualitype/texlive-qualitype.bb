SUMMARY = "The QualiType font collection"
DESCRIPTION = "These 45 fonts were created by QualiType. With the kind \
permisison of John Colletti, these fonts have been released as \
free and open-source."
LICENSE = "OFL-1.1"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-qualitype-2023.209.svn54512-54.1.noarch.rpm"
RPM_HASH = "5998efd84b63f652ec024841f1e326a4775b0364a4be03750649dd3efc55c38b9d6edb4b3580e3f5f358fa8339c9f21686a2757c3ba6569542e365ea77e71d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype"

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
texlive-qualitype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
