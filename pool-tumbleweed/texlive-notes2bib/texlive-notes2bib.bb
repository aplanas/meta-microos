SUMMARY = "Integrating notes into the bibliography"
DESCRIPTION = "The package defines a new type of note, bibnote, which will \
always be added to the bibliography. The package allows \
footnotes and endnotes to be moved into the bibliography in the \
same way. The package can be used with natbib and BibLaTeX as \
well as plain LaTeX citations. Both sorted and unsorted \
bibliography styles are supported. The package uses the LaTeX 3 \
macros and the associated xpackages bundle. It also makes use \
of the e-TeX extensions (any post-2005 LaTeX distribution will \
provide these by default, but users of older systems may need \
to use an elatex command or equivalent). The package relies on \
LaTeX 3 support from the l3kernel and l3packages bundles."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0msvn52231"

RPM_NAME = "texlive-notes2bib-2023.209.2.0msvn52231-55.1.noarch.rpm"
RPM_HASH = "112a05ff0e056882e666840265f5f9ec5064037b02fc65048709c2747a6a71f67ba101e27b15f13c5a8c0be0612e8a5b969466e02129e0c41f2139c5a23eda28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notes2bib.sty \
texlive-notes2bib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
