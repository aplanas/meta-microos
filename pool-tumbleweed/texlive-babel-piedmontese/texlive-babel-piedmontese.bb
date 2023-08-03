SUMMARY = "Babel support for Piedmontese"
DESCRIPTION = "The package provides the language definition file for support \
of Piedmontese in babel. Some shortcuts are defined, as well as \
translations to Piedmontese of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30282"

RPM_NAME = "texlive-babel-piedmontese-2023.209.1.0svn30282-54.1.noarch.rpm"
RPM_HASH = "f741f29179538900fe395a05e0892197d825826bbcac9591aea5475639197f815e0609be185197484df4061ef1196b2ea1f9f78e7ccfbbd692b8c17795aea898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-piedmontese.ldf \
texlive-babel-piedmontese"

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
