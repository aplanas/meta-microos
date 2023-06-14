SUMMARY = "Typesetting exercise or exam sheets"
DESCRIPTION = "This package is used for typesetting exercise or exam sheets. \
In addition, the exesheet class loads the schooldocs package. \
The package provides macros to mark out exercises and \
subparts, specific settings for enumeration lists, environments \
for questions and answers, with conditional display, macros for \
marking schemes with detailed comments."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn65577"

RPM_NAME = "texlive-exesheet-2023.201.2.0svn65577-52.1.noarch.rpm"
RPM_HASH = "41be3b282c9cde38e2b94107303a08d2e67ee68712127cfce56250dafa3a9bf8534ad923ee257cbdb3a72b2ccae39a9024ee0ae93be3471af5243d03c1844c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exesheet.cls \
tex-exesheet.sty \
texlive-exesheet"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumitem.sty \
tex-fancybox.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-mparhack.sty \
tex-ragged2e.sty \
tex-schooldocs.sty \
tex-tasks.sty \
tex-translations.sty \
tex-versions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
