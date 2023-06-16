SUMMARY = "An implementation of the colorbrewer2.org colours for MetaPost"
DESCRIPTION = "This package provides two MetaPost include files that define \
all the colorbrewer2.org colours: colorbrewer-cmyk.mp \
colorbrewer-rgb.mp The first defines all the colours as CMYK, \
the second as RGB. Use whichever one you prefer. For an example \
of what you can do, and a list of all the names, have a look at \
colorbrewer-sampler.mp. You can also see the names on \
http://colorbrewer2.org. The package also includes the Python \
script used to generate the MP source from the colorbrewer \
project."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn48753"

RPM_NAME = "texlive-metapost-colorbrewer-2023.201.svn48753-54.1.noarch.rpm"
RPM_HASH = "9f4e663a2fbb99379f5fa3083c868ab195b245da00f63e454048c42cc4d20b51849ccaf9036ecf26d7d5c47c90c861b39841cf48094379d0b9ef5d5a966551a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-colorbrewer"

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
