SUMMARY = "Run external programs on the contents of a start-stop environment"
DESCRIPTION = "The filter module provides a simple interface to run external \
programs on the contents of a start-stop environment. Options \
are available to run the external program only if the content \
of the environment has changed, to specify how the program \
output should be read back, and to choose the name of the \
temporary files that are created. The module is compatible with \
both MkII and MkIV."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn62070"

RPM_NAME = "texlive-context-filter-2023.209.svn62070-55.1.noarch.rpm"
RPM_HASH = "c7b778d447bc67f46b6140ff1ce4f2040e17a2dc314950406d83b6d3d8b59c225a49905d6855d6753659c938bd2fd6a6c05ee9df0c175336572acdfb202398bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-filter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
