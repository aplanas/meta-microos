SUMMARY = "Import individual data from script files"
DESCRIPTION = "This LaTeX package uses pgfkeys to retrieve individual data \
points generated in some script. Analogous to how one might \
generate graphics in a script and import those graphics into a \
LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn61772"

RPM_NAME = "texlive-datax-2023.209.1.2.0svn61772-55.1.noarch.rpm"
RPM_HASH = "c42b0acfdd80764d41f18b8e3485fd89ba33d481f33287ac61c7384e24b1ead8ac11d91c3caf4dbc30a88e8edabef3a1245721e43c8928dcec69f0c39f01c404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datax.sty \
texlive-datax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
