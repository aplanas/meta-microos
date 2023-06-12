SUMMARY = "Generate Beamer slideshows with song lyrics"
DESCRIPTION = "This package, together with the Beamer class, is used to \
generate slideshows with song lyrics. This is typically used in \
religious services in churches equipped with a projector, for \
which this package has been written, but it can be useful for \
any type of singing assembly. It provides environments to \
describe a song in a natural way, and formatting it into slides \
with overlays. The package comes with an additional Python \
script that can be used to convert plain-text song lyrics to \
the expected LaTeX markup."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.1svn64966"

RPM_NAME = "texlive-songproj-2023.201.1.0.1svn64966-57.1.noarch.rpm"
RPM_HASH = "5b7348026613babd35ff8d75bd682ad5700812d7c1896632ae0384197f45949de0b13ccfe0de241032225c017357e8ef76ef07815c99cd2f34d51246f84eec57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(songproj.sty) \
texlive-songproj"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(verse.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
