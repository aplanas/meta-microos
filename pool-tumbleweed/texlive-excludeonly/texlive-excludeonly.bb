SUMMARY = "Prevent files being \\include-ed"
DESCRIPTION = "The package defines an \\excludeonly command, which is (in \
effect) the opposite of \\includeonly. If both \\includeonly and \
\\excludeonly exist in a document, only files 'allowed' by both \
will be included. The package redefines the internal \\@include \
command, so it conflicts with packages that do the same. \
Examples are the classes paper.cls and thesis.cls."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn17262"

RPM_NAME = "texlive-excludeonly-2023.201.1.0svn17262-52.1.noarch.rpm"
RPM_HASH = "a801c65c00fbb73f39550c4a8731ef7a05ad8de357823418c02c276290920e23ba0e73e97e3cd310c5ebf92bb01149e973b0be0972da616dc1d148a2e56d9820"
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
