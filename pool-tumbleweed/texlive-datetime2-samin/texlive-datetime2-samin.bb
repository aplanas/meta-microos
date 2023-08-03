SUMMARY = "Northern Sami language module for the datetime2 package"
DESCRIPTION = "This module provides the 'samin' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49346"

RPM_NAME = "texlive-datetime2-samin-2023.209.1.1svn49346-53.1.noarch.rpm"
RPM_HASH = "41d161c848ad87a55957b2a82cca45b41a5183c205439c624b9fde025e726f7aa5a1747664724a7edbf8c043ca0f118867f10482c4f43dd7e771670d79244246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-samin-ascii.ldf \
tex-datetime2-samin-utf8.ldf \
tex-datetime2-samin.ldf \
texlive-datetime2-samin"

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
