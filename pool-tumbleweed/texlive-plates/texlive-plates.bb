SUMMARY = "Arrange for 'plates' sections of documents"
DESCRIPTION = "The plates package provides a simple facility for inserting \
colour figures in a document when they should be gathered and \
printed together as in a book's section of colour plates. The \
package provides a plate environment that takes the place of \
the figure environment for such colour images."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-plates-2023.209.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "1c7abe6c818c149af42e95aa3bf480f4a60a0b2296d576c55344c9c9b30d4b534f05e567b1b47cfce40ba3aff78301a3a76011221ea53933069cf505afea7c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endplate.sty \
tex-plates.sty \
texlive-plates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
