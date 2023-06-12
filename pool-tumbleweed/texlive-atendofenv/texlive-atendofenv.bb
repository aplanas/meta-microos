SUMMARY = "Add a custom symbol at the end of an environment"
DESCRIPTION = "This package allows adding a custom symbol at the end of an \
environment (e.g. theorems, definitions, remarks)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn62164"

RPM_NAME = "texlive-atendofenv-2023.201.0.0.2svn62164-53.1.noarch.rpm"
RPM_HASH = "cb95b0097544b88ae87c179fc91e5aedb3ca19bf50316c4d8b16617d05761b44b755212c40ccb02838100650fb41d209683abc967791542be4e953b721aa6796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(atendofenv.sty) \
texlive-atendofenv"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsthm.sty) \
tex(letltxmacro.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
