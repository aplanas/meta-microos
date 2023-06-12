SUMMARY = "Babel support for Latvian"
DESCRIPTION = "The package provides the language definition file for support \
of Latvian in babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn46681"

RPM_NAME = "texlive-babel-latvian-2023.201.2.0bsvn46681-53.1.noarch.rpm"
RPM_HASH = "2917f2472721b7c850c8aa2d46abc8ff1966ff244cf588678afaaa9171315e4d2f74c453b819263ddbaaea98e831c6e48bbbb1d70a448e8dd06883e3f9cf3a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latvian.ldf) \
texlive-babel-latvian"
RDEPENDS:${PN} += "/bin/sh \
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
