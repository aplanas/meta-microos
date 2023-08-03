SUMMARY = "Add reference labels to easylist items"
DESCRIPTION = "This package provides the \\itemLabel macro for adding \
configurable reference labels to easylist items."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51124"

RPM_NAME = "texlive-labels4easylist-2023.209.1.0svn51124-56.1.noarch.rpm"
RPM_HASH = "8373a89d05b54f0c34de4559a18bd9ea4f9b0c321849c97de971f9d0ab4201423c63fc2b66adf52527bdffa209c1950ffe3f60f1c9b7c704836c1ea5383f2f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labels4easylist.sty \
texlive-labels4easylist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-easylist.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
