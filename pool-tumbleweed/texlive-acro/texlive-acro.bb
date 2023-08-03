SUMMARY = "Typeset acronyms"
DESCRIPTION = "The package enables the author to create acronyms in a simple \
way, and provides means to add them to different 'classes' of \
acronyms. Lists can be created of separate acronym classes. The \
package option 'single' instructs the package to ignore \
acronyms that are used only once in the whole document. As an \
experimental feature the package also offers the option 'sort' \
which automatically sorts the list created by \\printacronyms."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.8svn62925"

RPM_NAME = "texlive-acro-2023.209.3.8svn62925-55.1.noarch.rpm"
RPM_HASH = "c24a90faadfed4f1c2034ace382c8e677b1f6700bd660c0dc6f4342bdfc20793d6e4c1cd42a4a0394d92ab8f95863f8ca2e2e65a4c312e75b8c5d5a97c9fb453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acro-examples.sty \
tex-acro.sty \
tex-acro2.sty \
texlive-acro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pdfcomment.sty \
tex-translations.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xtemplate.sty \
tex-zref-abspage.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
