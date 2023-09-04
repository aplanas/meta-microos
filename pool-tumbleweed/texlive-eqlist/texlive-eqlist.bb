SUMMARY = "Description lists with equal indentation"
DESCRIPTION = "This package provides a list environment which sets a \
description-like list in which the indentation corresponds to \
the longest item of the list."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32257"

RPM_NAME = "texlive-eqlist-2023.209.2.1svn32257-54.2.noarch.rpm"
RPM_HASH = "b50f6414e80f9aaa5880096c0d301e381e30570b5ec94ece51f049a1737d754d159db02cbde32e8df5758decbce5a0aefdc405b37312b63e6802fdb7bfa8aa0e"
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
