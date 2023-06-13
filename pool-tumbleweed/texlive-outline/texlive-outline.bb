SUMMARY = "List environment for making outlines"
DESCRIPTION = "The package defines an outline environment, which provides \
facilities similar to enumerate, but up to 6 levels deep."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18360"

RPM_NAME = "texlive-outline-2023.201.svn18360-54.1.noarch.rpm"
RPM_HASH = "818547d65460c87faf36686e4f87047996e9fc32a2dc5e80a28602429d542bfdf36bb6c999f4255baa653b4149d35217115a2ee12d4982a9c96f2680ffa05372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(outline.sty) \
texlive-outline"

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
