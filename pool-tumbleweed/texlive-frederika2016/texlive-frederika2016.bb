SUMMARY = "An OpenType Greek calligraphy font"
DESCRIPTION = "Frederika2016 is an attempt to digitize Hermann Zapf's \
Frederika font. The font is the Greek companion of Virtuosa by \
the same designer. This font is a calligraphy font and this is \
an initial release."
LICENSE = "OFL-1.1"

PV = "2023.209.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-2023.209.1.000_2016_initial_releasesvn42157-53.1.noarch.rpm"
RPM_HASH = "dc78add92858934d815b08db7d9947db9065406554f5806e063fa6278fefcf95a975a09d72fd088d584181d683b10d82d0db13ef3eed23f84f2aa1e2dbad1e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frederika2016"

RDEPENDS:${PN} += "/usr/bin/sh \
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
