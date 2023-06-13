SUMMARY = "Serbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'serbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. It provides both \
Cyrillic and Latin, Ekavian and Ijekavian variants of Serbian \
date formats, regionalized and non-regionalized."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn52893"

RPM_NAME = "texlive-datetime2-serbian-2023.201.2.1.0svn52893-52.1.noarch.rpm"
RPM_HASH = "5103f6289962e252c830db18f063a4a6e43d2c545e13eaf372ee4cc7fdfb0c911a41bb8852374171a8fc8ed6217748368dec499e8ee98342fe0f44604d736a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-serbian-base-ascii.ldf) \
tex(datetime2-serbian-base-utf8.ldf) \
tex(datetime2-serbian-base.ldf) \
tex(datetime2-serbian.ldf) \
tex(datetime2-serbianc.ldf) \
tex(datetime2-sr-Cyrl-BA.ldf) \
tex(datetime2-sr-Cyrl-ME.ldf) \
tex(datetime2-sr-Cyrl-RS.ldf) \
tex(datetime2-sr-Cyrl.ldf) \
tex(datetime2-sr-Latn-BA.ldf) \
tex(datetime2-sr-Latn-ME.ldf) \
tex(datetime2-sr-Latn-RS.ldf) \
tex(datetime2-sr-Latn.ldf) \
texlive-datetime2-serbian"

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
