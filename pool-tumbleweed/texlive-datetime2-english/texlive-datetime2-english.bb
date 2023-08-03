SUMMARY = "English language module for the datetime2 package"
DESCRIPTION = "This module provides the following styles that can be set using \
\\DTMsetstyle provided by datetime2.sty. The region not only \
determines the date/time format but also the time zone \
abbreviations if the zone mapping setting is on. english \
(English - no region) en-GB (English - United Kingdom of Great \
Britain and Northern Ireland) en-US (English - United States of \
America) en-CA (English - Canada) en-AU (English - Commonwealth \
of Australia) en-NZ (English - New Zealand) en-GG (English - \
Bailiwick of Guernsey) en-JE (English - Bailiwick of Jersey) \
en-IM (English - Isle of Man) en-MT (English - Republic of \
Malta) en-IE (English - Republic of Ireland)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn52479"

RPM_NAME = "texlive-datetime2-english-2023.209.1.05svn52479-53.1.noarch.rpm"
RPM_HASH = "a8c00e05fcdf2c8666c1db1c5f9232fc2ca948b635ff88452e0b61aba68d39a1b3653baea322c3be3043eda62da86f66b7eb5ad7c75c57c5a26d1566e13194d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-en-AU.ldf \
tex-datetime2-en-CA.ldf \
tex-datetime2-en-GB.ldf \
tex-datetime2-en-GG.ldf \
tex-datetime2-en-IE.ldf \
tex-datetime2-en-IM.ldf \
tex-datetime2-en-JE.ldf \
tex-datetime2-en-MT.ldf \
tex-datetime2-en-NZ.ldf \
tex-datetime2-en-US.ldf \
tex-datetime2-english-base.ldf \
tex-datetime2-english.ldf \
texlive-datetime2-english"

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
