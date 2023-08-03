SUMMARY = "List environment for making outlines"
DESCRIPTION = "The package defines an outline environment, which provides \
facilities similar to enumerate, but up to 6 levels deep."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18360"

RPM_NAME = "texlive-outline-2023.209.svn18360-55.1.noarch.rpm"
RPM_HASH = "87e6b5c65f7673eead136d500d4b5da054f08121a4f0583a93d32f9fdc7478aac11752c70a5b3fb4de9c8d8f12ddb1610f704961346ed78bd9f61d25c091573f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outline.sty \
texlive-outline"

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
