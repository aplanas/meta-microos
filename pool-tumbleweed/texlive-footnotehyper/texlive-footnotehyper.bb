SUMMARY = "Hyperref aware footnote.sty"
DESCRIPTION = "The footnote package by Mark Wooding dates back to 1997 and has \
not been made hyperref compatible. The aim of the present \
package is to do that."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1esvn60374"

RPM_NAME = "texlive-footnotehyper-2023.209.1.1esvn60374-53.1.noarch.rpm"
RPM_HASH = "04ae9d12cbe9fc04b8dfb6e4911561851c065b40e82fc7c67d2f32a832f07e9142c4459f07ae9e613bedced9de06c84efc3f8e2fb8e92e5944b8bfdb07493673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnotehyper.sty \
texlive-footnotehyper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
