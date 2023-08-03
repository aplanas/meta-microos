SUMMARY = "Typesetting LaTeX source code"
DESCRIPTION = "This package provides a way to typeset LaTeX source code and \
the related result in the same document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3ssvn57414"

RPM_NAME = "texlive-showexpl-2023.209.0.0.3ssvn57414-54.1.noarch.rpm"
RPM_HASH = "c22f750ff87b52f27246bf08c84b9700922a34b064c215857002c39bbeab5f99c611e0879be8384dc0813d55c4d2e462c6be7ecefaa1aa567780ed911c251982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showexpl.sty \
texlive-showexpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphicx.sty \
tex-listings.sty \
tex-refcount.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
