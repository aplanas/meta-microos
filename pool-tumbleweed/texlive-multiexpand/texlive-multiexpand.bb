SUMMARY = "Variations on the primitive command \\expandafter"
DESCRIPTION = "The package provides two user commands; one that performs \
multiple expansions, and one that does multiple \\expandafter \
operations, in a single macro call. The author suggests that \
the same effect could be provided by use of the command variant \
mechanisms of LaTeX 3 (see, for example, the interface \
documentation of the experimental LaTeX 3 kernel)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn45943"

RPM_NAME = "texlive-multiexpand-2023.209.1.5svn45943-55.1.noarch.rpm"
RPM_HASH = "ef408358fbfe04188078fd6f93df9fa75f8e568a8d060cbe285fff513329e44f46c5734a866e173d28d33c37bfb2b5574fe907b8a83998f0628ec5555981a6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiexpand.sty \
texlive-multiexpand"

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
