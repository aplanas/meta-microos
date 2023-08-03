SUMMARY = "Basic Support for Writing Burmese"
DESCRIPTION = "This package provides basic support for writing Burmese. The \
package provides a preprocessor (written in Perl), an Adobe \
Type 1 font, and LaTeX macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25185"

RPM_NAME = "texlive-burmese-2023.209.svn25185-53.1.noarch.rpm"
RPM_HASH = "f9f7010b77e7dc1d603a8c9fd3e596e5edf542e63e4659c94637aabb7551f7ad85e952a111a7c099e9bac03b287cab454ec30d64b02e5b47e8e9521601e51dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-birm.sty \
tex-burm.tfm \
tex-burmese.map \
tex-ubirm.fd \
texlive-burmese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-updmap.cfg \
texlive \
texlive-burmese-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
