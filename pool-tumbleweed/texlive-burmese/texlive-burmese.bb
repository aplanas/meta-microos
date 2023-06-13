SUMMARY = "Basic Support for Writing Burmese"
DESCRIPTION = "This package provides basic support for writing Burmese. The \
package provides a preprocessor (written in Perl), an Adobe \
Type 1 font, and LaTeX macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25185"

RPM_NAME = "texlive-burmese-2023.201.svn25185-52.1.noarch.rpm"
RPM_HASH = "72fed707875ad96e70ebc542d7cfd3e03c9ecd45176d648bcb5586e10e52cdb49e3abcfa9d9c5484a8645e43419475e57bb4f644b6b7ec9c1a3d12fadaf6a9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(birm.sty) \
tex(burm.tfm) \
tex(burmese.map) \
tex(ubirm.fd) \
texlive-burmese"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(relsize.sty) \
tex(updmap.cfg) \
texlive \
texlive-burmese-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
