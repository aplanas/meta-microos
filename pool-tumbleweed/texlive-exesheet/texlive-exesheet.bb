SUMMARY = "Typesetting exercise or exam sheets"
DESCRIPTION = "This package is used for typesetting exercise or exam sheets. \
In addition, the exesheet class loads the schooldocs package. \
The package provides macros to mark out exercises and \
subparts, specific settings for enumeration lists, environments \
for questions and answers, with conditional display, macros for \
marking schemes with detailed comments."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn65577"

RPM_NAME = "texlive-exesheet-2023.209.2.0svn65577-53.1.noarch.rpm"
RPM_HASH = "b80a16426424b286b4cd37f6af50cd74d9654053e01437dc94f64ae94d9a097818d3ae53c6c3dab2bc3b419c760e8397a0b17810583208990e87d9bff225ea22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exesheet.cls \
tex-exesheet.sty \
texlive-exesheet"

RDEPENDS:${PN} += "/usr/bin/sh \
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
