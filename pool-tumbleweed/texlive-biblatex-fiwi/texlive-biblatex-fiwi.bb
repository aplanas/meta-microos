SUMMARY = "BibLaTeX styles for use in German humanities"
DESCRIPTION = "The package provides a collection of styles for BibLaTeX \
(version 3.5 is required, currently). It was designed for \
citations in German Humanities, especially film studies, and \
offers some features that are not provided by the standard \
BibLaTeX styles. The style is highly optimized for documents \
written in German, and the main documentation is only available \
in German."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn45876"

RPM_NAME = "texlive-biblatex-fiwi-2023.209.1.7svn45876-54.1.noarch.rpm"
RPM_HASH = "bc55d755194603ef133eb653bcbdecc8f1d204f459303da391f26619ae94f82766435775bdb30f0ac9d6de72bebee43f989a380bbca26a3432d9e2f95e23e8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fiwi-yearbeginning.bbx \
tex-fiwi.bbx \
tex-fiwi.cbx \
tex-fiwi2.bbx \
tex-fiwi2.cbx \
texlive-biblatex-fiwi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ragged2e.sty \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
