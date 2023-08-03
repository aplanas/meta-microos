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

PV = "2023.209.svn48753"

RPM_NAME = "texlive-metapost-colorbrewer-2023.209.svn48753-55.1.noarch.rpm"
RPM_HASH = "885788b0e960b53072db16b7ff0bcdd79c9bd4e49167d5793564e05258800607b545dbf213ddca80e703e82b6836913d477de97a126aa6aa89b590eaeddd45ac"
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
