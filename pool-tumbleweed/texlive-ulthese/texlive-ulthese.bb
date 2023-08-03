SUMMARY = "Thesis class and templates for Universite Laval"
DESCRIPTION = "The package provides a class based on memoir to prepare theses \
and memoirs compliant with the presentation rules set forth by \
the Faculty of Graduate Studies of Universite Laval, Quebec, \
Canada. The class also comes with an extensive set of templates \
for the various types of theses and memoirs offered at Laval. \
Please note that the documentation for the class and the \
comments in the templates are all written in French, the \
language of the target audience."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.3asvn60217"

RPM_NAME = "texlive-ulthese-2023.209.5.3asvn60217-54.1.noarch.rpm"
RPM_HASH = "472b047af181c5c73422bcb98f9854ccb87a65451d05a22ae87283caa339124b243b194007ac6fd5d26fd66ab839a6e9a9875e14cce5cce0def13801d10b6861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulthese.cls \
texlive-ulthese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-chapterbib.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-memoir.cls \
tex-natbib.sty \
tex-numprint.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
