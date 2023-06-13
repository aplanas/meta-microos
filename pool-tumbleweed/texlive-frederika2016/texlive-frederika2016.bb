SUMMARY = "An OpenType Greek calligraphy font"
DESCRIPTION = "Frederika2016 is an attempt to digitize Hermann Zapf's \
Frederika font. The font is the Greek companion of Virtuosa by \
the same designer. This font is a calligraphy font and this is \
an initial release."
LICENSE = "OFL-1.1"

PV = "2023.201.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-2023.201.1.000_2016_initial_releasesvn42157-52.1.noarch.rpm"
RPM_HASH = "148e951ae35573189fdce168f0e0388ca19f93ef3274164058743a174fa16ca92d07f459e42cbcb4e4a782fd7e1cd1189e8bf625cde825e4c6961f8566da017d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frederika2016"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-frederika2016-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
