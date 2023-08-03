SUMMARY = "Typeset examples for TeX courses"
DESCRIPTION = "The package makes it easier to produce examples for TeX course. \
It provides an example environment, which typesets its contents \
on the left of the page, and prints it verbatim on the right."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn33398"

RPM_NAME = "texlive-example-2023.209.svn33398-53.1.noarch.rpm"
RPM_HASH = "8ecbe92c65579e68372b73feb3573ab7182b74f234416173b944a8a562d640730b1b14d2e1a24f88e6ce9c900d91c397502f31d10ce609310e2ec67bf050393e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-example.sty \
texlive-example"

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
