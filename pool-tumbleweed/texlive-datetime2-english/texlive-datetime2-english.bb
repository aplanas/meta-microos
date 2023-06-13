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

PV = "2023.201.1.05svn52479"

RPM_NAME = "texlive-datetime2-english-2023.201.1.05svn52479-52.1.noarch.rpm"
RPM_HASH = "4eeb66177ca3c173423859c90df5058953d8563edffb7052b834e1f74c9701c276f59b32001624db32c6929b097009eaf8503c2018ca7a86fe194fbf2234fe15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-en-AU.ldf) \
tex(datetime2-en-CA.ldf) \
tex(datetime2-en-GB.ldf) \
tex(datetime2-en-GG.ldf) \
tex(datetime2-en-IE.ldf) \
tex(datetime2-en-IM.ldf) \
tex(datetime2-en-JE.ldf) \
tex(datetime2-en-MT.ldf) \
tex(datetime2-en-NZ.ldf) \
tex(datetime2-en-US.ldf) \
tex(datetime2-english-base.ldf) \
tex(datetime2-english.ldf) \
texlive-datetime2-english"

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
