SUMMARY = "Prevent page numbers on part pages"
DESCRIPTION = "The package bundles the answer to the long-standing FAQ about \
removing page numbers on \\part pages. The package accepts no \
options and defines no user commands; the user needs only to \
load it, and the requirement is met."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn22114"

RPM_NAME = "texlive-nonumonpart-2023.209.1svn22114-55.1.noarch.rpm"
RPM_HASH = "f48514d98d7f373d7fb7eb207566dd31436b0790b0bcfa419e66c3f5cd351c3d7a970eb934a654ccc3465336544fa3688a211cc0b6a110990d4c7f308a79bf2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nonumonpart.sty \
texlive-nonumonpart"

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
