SUMMARY = "Description lists with equal indentation"
DESCRIPTION = "This package provides a list environment which sets a \
description-like list in which the indentation corresponds to \
the longest item of the list."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32257"

RPM_NAME = "texlive-eqlist-2023.209.2.1svn32257-54.1.noarch.rpm"
RPM_HASH = "d73f80e393a90b6ba0f3287dd30f94aed8b3c598e2e2102fb747e1504848f652c1b69ec45fb6a3620e22a6319b8ec73801f1ed0c1f525fb593f4683506e2cc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqlist.sty \
texlive-eqlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eqparbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
