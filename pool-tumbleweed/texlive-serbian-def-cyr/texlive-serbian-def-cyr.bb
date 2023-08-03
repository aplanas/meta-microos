SUMMARY = "Serbian cyrillic localization"
DESCRIPTION = "This package provides abstract, chapter, title, date etc, for \
serbian language in cyrillic scripts in T2A encoding and cp1251 \
code pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23734"

RPM_NAME = "texlive-serbian-def-cyr-2023.209.svn23734-54.1.noarch.rpm"
RPM_HASH = "27ba4b5b0637eb764a110877137b5c83d55196c9543b075224041db5b803f2bc7a9e2204fcb906531d015c415d8df7143cff71b41a657d1f4018ac83d94c4208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-def-cyr.sty \
texlive-serbian-def-cyr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
