SUMMARY = "Typeset acronyms"
DESCRIPTION = "The package enables the author to create acronyms in a simple \
way, and provides means to add them to different 'classes' of \
acronyms. Lists can be created of separate acronym classes. The \
package option 'single' instructs the package to ignore \
acronyms that are used only once in the whole document. As an \
experimental feature the package also offers the option 'sort' \
which automatically sorts the list created by \\printacronyms."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.8svn62925"

RPM_NAME = "texlive-acro-2023.201.3.8svn62925-54.1.noarch.rpm"
RPM_HASH = "a66b5b875dacca42071f87ea7252889745e5508ec49a951fd064fb82acdd23616532caa0a652b04b2202564a10c696abf1c48b736335a59f85c22331f34c57bf"
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
