SUMMARY = "Print vectors, matrices, and tensors"
DESCRIPTION = "This package provides commands for vectors, matrices, and \
tensors with different styles -- arrows (as the LaTeX default), \
underlined, and bold."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-2023.209.0.0.61svn54080-54.1.noarch.rpm"
RPM_HASH = "fcf3ceb0d66964bf5528202546a191e0b89c2b121b233d38913c010ce9944132c5509dba022304b857356a5c4fe52fd6469f6b06fd163836bcdbf50654d32406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hhtensor.sty \
texlive-hhtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ushort.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
