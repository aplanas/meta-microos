SUMMARY = "Prevent files being \\include-ed"
DESCRIPTION = "The package defines an \\excludeonly command, which is (in \
effect) the opposite of \\includeonly. If both \\includeonly and \
\\excludeonly exist in a document, only files 'allowed' by both \
will be included. The package redefines the internal \\@include \
command, so it conflicts with packages that do the same. \
Examples are the classes paper.cls and thesis.cls."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn17262"

RPM_NAME = "texlive-excludeonly-2023.209.1.0svn17262-53.1.noarch.rpm"
RPM_HASH = "7abfbfad43735c55142d1f9c1a099d8d184e869f4e2ae18e73f475b2527936bc8c0e77c52bd4840633751da9c5f756ffc1bc69ae83ec6f454d3e16abbcda0cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-excludeonly.sty \
texlive-excludeonly"

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
