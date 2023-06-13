SUMMARY = "References by 'division' in classical sources"
DESCRIPTION = "The package enables the user to make reference to 'division \
marks' (such as book, chapter, section), in the document being \
referenced, in addition to the page-based references that \
BibTeX-based citations have always had. The citation is made in \
the same way as the LaTeX standard, but what's inside the \
square brackets may include the 'division' specification, as in \
\\cite[(<division spec.>)<page number>]{<document>}"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4.2svn45379"

RPM_NAME = "texlive-biblatex-source-division-2023.201.2.4.2svn45379-53.1.noarch.rpm"
RPM_HASH = "48da32b3ad332ed7e11a016e0f51226c836d553d0535a96e5923ec94ff6a7d4f50d69848e097f99f86f79fdd221c8144b8fefc5d8276dec7d0c4e22a71a82e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-source-division.sty) \
texlive-biblatex-source-division"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
