SUMMARY = "Babel support for Czech"
DESCRIPTION = "The package provides the language definition file for support \
of Czech in babel. Some shortcuts are defined, as well as \
translations to Czech of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1asvn30261"

RPM_NAME = "texlive-babel-czech-2023.201.3.1asvn30261-53.1.noarch.rpm"
RPM_HASH = "bc9962b04ccbb0f3df60e3c599278e65fec3c657060cfcb89488eb0f699604c1627add3e3ac4c35ca52334d101c72312b1e0b39659120f03e83e205339ea575e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-czech.ldf \
texlive-babel-czech"

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
