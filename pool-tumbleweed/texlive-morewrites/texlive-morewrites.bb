SUMMARY = "Always room for a new write stream"
DESCRIPTION = "The package aims to solve the error 'No room for a new \\write', \
which occurs when the user, or when the user's packages have \
'allocated too many streams' using \\newwrite (TeX has a fixed \
maximum number - 16 - such streams built-in to its code). The \
package hooks into TeX primitive commands associated with \
writing to files; it should be loaded near the beginning of the \
sequence of loading packages for a document. The package uses \
the l3kernel bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49531"

RPM_NAME = "texlive-morewrites-2023.209.svn49531-55.1.noarch.rpm"
RPM_HASH = "4f4995850b4329cc757c11f383074fa6b133cc9452b21c46660d0c148065bd85b28e45fcf41a4d90f18945d4d3aaa0a60195bf64488e930ddb896a72b12fd46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morewrites.sty \
tex-primargs.sty \
texlive-morewrites"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
