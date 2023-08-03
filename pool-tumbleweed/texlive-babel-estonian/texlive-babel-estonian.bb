SUMMARY = "Babel support for Estonian"
DESCRIPTION = "The package provides the language definition file for support \
of Estonian in babel. Some shortcuts are defined, as well as \
translations to Estonian of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38064"

RPM_NAME = "texlive-babel-estonian-2023.209.1.1asvn38064-54.1.noarch.rpm"
RPM_HASH = "d35fff663464fea35ba4c53603e5c12accadcd2899c4c4fdb550f6bee0a76ae7b0d6a83da726e52eadfcb5024a5f797d90707b8fbf96e221ab2b63b1c23b77ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-estonian.ldf \
texlive-babel-estonian"

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
