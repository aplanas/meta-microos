SUMMARY = "Typeset examples for TeX courses"
DESCRIPTION = "The package makes it easier to produce examples for TeX course. \
It provides an example environment, which typesets its contents \
on the left of the page, and prints it verbatim on the right."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn33398"

RPM_NAME = "texlive-example-2023.201.svn33398-52.1.noarch.rpm"
RPM_HASH = "74e22a567436fabf2851ed14162b7b68c44d56d1b53b49444dd6d5df34fcaff670ed83bdc988b1aacf6ea1e94ead348dcf089746455f29461828f34c6cd88db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(example.sty) \
texlive-example"

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
