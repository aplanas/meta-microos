SUMMARY = "Estonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Estonian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-estonian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "e376b43b78d5064a97d0e765397376a7b28cefd001feba4fb1f57b6a3c9d42be8005e623206bb953a0a825d1be17bbea710957be3775b0d22dca412b91bea38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-et.ec.tex \
tex-hyph-et.tex \
tex-loadhyph-et.tex \
texlive-hyphen-estonian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
