SUMMARY = "MetaPost macros for drawing Chinese and Japanese abaci"
DESCRIPTION = "These macros are described in Denis Roegel: MetaPost macros for \
drawing Chinese and Japanese abaci, TUGboat (volume 30, number \
1, 2009, pages 74-79)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-suanpan-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "55cd81085817b0d1ee676ce91d5e1648daee30a1c8c8f9f8b3f0ea2ca0bbff959ec0743ff02a2b73cfeef7d35f9cdeaf360d68aa11d0c734ccd7e19feb0aa1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suanpan"
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
