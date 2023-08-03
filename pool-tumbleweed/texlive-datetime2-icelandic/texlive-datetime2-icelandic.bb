SUMMARY = "Icelandic language module for the datetime2 package"
DESCRIPTION = "This module provides the 'icelandic' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65213"

RPM_NAME = "texlive-datetime2-icelandic-2023.209.1.2svn65213-53.1.noarch.rpm"
RPM_HASH = "f2c9444778cc399262fb3c0c3950ec306c6c175336510abc4f12d03b38302be79f81413aa7cbde0e1c81df524ca3467d2608935b51d09d002210167737cda50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-icelandic-ascii.ldf \
tex-datetime2-icelandic-utf8.ldf \
tex-datetime2-icelandic.ldf \
texlive-datetime2-icelandic"

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
