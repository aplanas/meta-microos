SUMMARY = "Use Concrete fonts"
DESCRIPTION = "Typeset a LaTeX2e document with the Concrete fonts designed by \
Don Knuth and used in his book 'Concrete Mathematics'."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-beton-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "bf10b7ed76d1d69ee5b33e31e7f7a99f4f8cd2a1a185809079f93f3a016cc0e2438c930e6e01d06aee107fda1577c6e934c68d25cdf8610ae51407d6b06d9e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beton.sty \
texlive-beton"

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
