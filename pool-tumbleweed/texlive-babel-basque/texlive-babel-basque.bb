SUMMARY = "Babel contributed support for Basque"
DESCRIPTION = "The package establishes Basque conventions in a document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn30256"

RPM_NAME = "texlive-babel-basque-2023.209.1.0fsvn30256-54.1.noarch.rpm"
RPM_HASH = "38aa61e9a90750c1078a0c38b4efa4974e1a1ceb193c2994fedd5a874f4e41b70654e1f4aaabcf0e58dd7b7aab56f4856fcacd4fcdeee983f784117d2b8b765f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque.ldf \
texlive-babel-basque"

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
