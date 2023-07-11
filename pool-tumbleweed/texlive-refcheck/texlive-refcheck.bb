SUMMARY = "Check references (in figures, table, equations, etc)"
DESCRIPTION = "The package checks references in a document, looking for \
numbered but unlabelled equations, for labels which are not \
used in the text, for unused bibliography references. It can \
also display label names in text near corresponding numbers of \
equations and/or bibliography references."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-2023.201.1.9.1svn29128-53.2.noarch.rpm"
RPM_HASH = "e50dacc38470ea1a11c9b2a7779eed308c3209d745c152ff0031058e5b9f313e54e6661015753cb43cc2798afadfb8b4786f309d449d70152243f9dd45e6200d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refcheck.sty \
texlive-refcheck"

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
