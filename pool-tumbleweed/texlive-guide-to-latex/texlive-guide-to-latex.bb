SUMMARY = "Examples and more from Guide to LaTeX, by Kopka and Daly"
DESCRIPTION = "The guide-to-latex package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45712"

RPM_NAME = "texlive-guide-to-latex-2023.209.svn45712-54.1.noarch.rpm"
RPM_HASH = "9d403eafac662339dce247efe7070c81f4f3626ec0875d396933914de411be7eed195e6d00eb93c7893cba9a058ceb01ec8ce0783101dc2cdd459e8ebb617076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guide-to-latex"

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
