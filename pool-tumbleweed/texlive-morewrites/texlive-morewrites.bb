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

PV = "2023.201.svn49531"

RPM_NAME = "texlive-morewrites-2023.201.svn49531-54.1.noarch.rpm"
RPM_HASH = "6f47babf1f99f35ecb1e60066ab0f57ffd68613e2dd2c99b89ecc531d02a9c357b2bccb8f81e02602576e505b9b76c6119bc7731870d5fea1c947c4ddf44ab90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morewrites.sty \
tex-primargs.sty \
texlive-morewrites"

RDEPENDS:${PN} += "/bin/sh \
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
