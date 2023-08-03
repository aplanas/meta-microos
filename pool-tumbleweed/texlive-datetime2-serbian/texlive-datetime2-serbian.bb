SUMMARY = "Serbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'serbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. It provides both \
Cyrillic and Latin, Ekavian and Ijekavian variants of Serbian \
date formats, regionalized and non-regionalized."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn52893"

RPM_NAME = "texlive-datetime2-serbian-2023.209.2.1.0svn52893-53.1.noarch.rpm"
RPM_HASH = "fe3805c0f6cf48830b750d2eab135e4041815797a7b2499d2c4325be7c09c58e26d4f571897cd995beeaad358cb306908ee5fcf38b531e917ed62923ba5aa8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-serbian-base-ascii.ldf \
tex-datetime2-serbian-base-utf8.ldf \
tex-datetime2-serbian-base.ldf \
tex-datetime2-serbian.ldf \
tex-datetime2-serbianc.ldf \
tex-datetime2-sr-Cyrl-BA.ldf \
tex-datetime2-sr-Cyrl-ME.ldf \
tex-datetime2-sr-Cyrl-RS.ldf \
tex-datetime2-sr-Cyrl.ldf \
tex-datetime2-sr-Latn-BA.ldf \
tex-datetime2-sr-Latn-ME.ldf \
tex-datetime2-sr-Latn-RS.ldf \
tex-datetime2-sr-Latn.ldf \
texlive-datetime2-serbian"

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
