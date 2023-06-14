SUMMARY = "Variations on the primitive command \\expandafter"
DESCRIPTION = "The package provides two user commands; one that performs \
multiple expansions, and one that does multiple \\expandafter \
operations, in a single macro call. The author suggests that \
the same effect could be provided by use of the command variant \
mechanisms of LaTeX 3 (see, for example, the interface \
documentation of the experimental LaTeX 3 kernel)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn45943"

RPM_NAME = "texlive-multiexpand-2023.201.1.5svn45943-54.1.noarch.rpm"
RPM_HASH = "e9633766c6a11281f745b8049da6c75756673f1681bb0aee4fa5814223a6abb0febc52f8c1adfc2d51dd8ac53a7f7e603df694bb10ce17d37f858d57bc4604f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiexpand.sty \
texlive-multiexpand"

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
