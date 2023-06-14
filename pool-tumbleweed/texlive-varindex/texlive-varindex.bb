SUMMARY = "Luxury frontend to the \\index command"
DESCRIPTION = "Provides a convenient front-end for the \\index command. For \
example, with it you can generate multiple index entries in \
almost any form by a single command. The package is highly \
customizable, and works with all versions of LaTeX and probably \
most other TeX formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn32262"

RPM_NAME = "texlive-varindex-2023.201.2.3svn32262-53.1.noarch.rpm"
RPM_HASH = "1602760d90039823748f94e50ea3a9660d82f3913a8c442a3f66b0e883d5fc422f0abde731c6ffc1279bbb53416b65c4ef083a51d40874fbf15ccfd8ef7699b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varindex.sty \
texlive-varindex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-toolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
