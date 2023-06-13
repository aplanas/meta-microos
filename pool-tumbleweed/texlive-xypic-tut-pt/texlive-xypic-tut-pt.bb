SUMMARY = "A tutorial for XY-pic, in Portuguese"
DESCRIPTION = "The xypic-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-xypic-tut-pt-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "a8af4ca742e79c51481501af4753d319a3407bb5ed88f01377899cbd3f40d3e4973fd145beb973840f0c2933fd8f802bb86cdb649fbb0d238aa9d4a8583e615e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xypic-tut-pt"

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
