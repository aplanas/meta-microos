SUMMARY = "Babel contributed support for Bulgarian"
DESCRIPTION = "The package provides support for documents in Bulgarian (or \
simply containing some Bulgarian text)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2gsvn31902"

RPM_NAME = "texlive-babel-bulgarian-2023.209.1.2gsvn31902-54.1.noarch.rpm"
RPM_HASH = "eaf5153300e647330f5e85cd56d41131f9e38651f1d31aaeb0d31b00f0f8f9611f751bdfe845213fe9190dec7e5cbacd316166b1c162ea00aa6e2a4bc5b51c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bulgarian.ldf \
texlive-babel-bulgarian"

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
