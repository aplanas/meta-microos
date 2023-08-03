SUMMARY = "German language module for the datetime2 package"
DESCRIPTION = "This module provides the 'german' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn53125"

RPM_NAME = "texlive-datetime2-german-2023.209.3.0svn53125-53.1.noarch.rpm"
RPM_HASH = "ee3d670de2598bd4786555c51ed9edfa7fee67c7c9658a94ab56f4ce248dc4059c7b0883e6727157eac1a51bbd5eaf3048058ec9f0b99a85657541227ef868ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-de-AT.ldf \
tex-datetime2-de-CH.ldf \
tex-datetime2-de-DE.ldf \
tex-datetime2-german-base-ascii.ldf \
tex-datetime2-german-base-utf8.ldf \
tex-datetime2-german-base.ldf \
tex-datetime2-german.ldf \
texlive-datetime2-german"

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
