SUMMARY = "A package for creating a curriculum vitae"
DESCRIPTION = "The package is distributed with two example files; they (and \
their formatted output) constitute the only real documentation. \
Note that cv is just a package: you choose the overall \
formatting by deciding which class to use, while the package \
provides the detailed formatting."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cv-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "ab8f71905df004cb603f392308652456a48221f0125df39d07eb8e4441acaa7a74fdc6d8bfe125a72c29fe1bf442159d87c07df92f2af39cfcf5f74e752c2361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CV.sty \
texlive-cv"

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
