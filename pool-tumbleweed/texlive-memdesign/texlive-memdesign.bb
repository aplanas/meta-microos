SUMMARY = "Notes on book design"
DESCRIPTION = "'A Few Notes on Book Design' provides an introduction to the \
business of book design. It is an extended version of what used \
to be the first part of the memoir users' manual. Please note \
that the compiled copy, supplied in the package, uses \
commercial fonts; the README file contains instructions on how \
to compile the document without these fonts."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn48664"

RPM_NAME = "texlive-memdesign-2023.208.svn48664-53.1.noarch.rpm"
RPM_HASH = "9bb7e465ebc1cba58b1f64c560b51235d4344c9f55b1ec80c96306443e65169d1fcb27dbd4245de6f367122ae4942d3b4eb85810da1546e7eeeee2e9125865d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memdesign"

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
