SUMMARY = "Description lists with equal indentation"
DESCRIPTION = "This package provides a list environment which sets a \
description-like list in which the indentation corresponds to \
the longest item of the list."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32257"

RPM_NAME = "texlive-eqlist-2023.201.2.1svn32257-53.2.noarch.rpm"
RPM_HASH = "e45445d9ab006377aa60a3482cc15a391876194b23af9d52373b456a2d0a6e7d1d0f83503a1fc29fcd3ec635fd4a9a708d0836d6946cbde3cf8b1a8ecde43c4d"
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
