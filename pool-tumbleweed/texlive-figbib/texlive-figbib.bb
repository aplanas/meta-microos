SUMMARY = "Organize figure databases with BibTeX"
DESCRIPTION = "FigBib lets you organize your figures in BibTeX databases. Some \
FigBib features are: Store and manage figures in a BibTeX \
database; Include figures in your LaTeX document with one short \
command; Generate a List of Figures containing more/other \
information than the figure captions; Control with one switch \
where to output the figures, either as usual float objects or \
in a separate part at the end of your document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19388"

RPM_NAME = "texlive-figbib-2023.209.svn19388-53.1.noarch.rpm"
RPM_HASH = "a7fdb5ac869cc96a07cd9f8ec705609f90d2ed18d1ac25f26708d2cf804424355a882737f5cc8f1535fe601e7aa99e9ffa3180be714b7a48241002f187c20631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figbib.sty \
texlive-figbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epsfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
