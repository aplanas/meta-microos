SUMMARY = "Shade pieces of text"
DESCRIPTION = "The package provides a shaded backdrop to a box of text. It \
uses a Metafont font (provided) which generates to appropriate \
shading dependent on the resolution used in the Metafont \
printer parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn22212"

RPM_NAME = "texlive-shade-2023.201.1svn22212-53.1.noarch.rpm"
RPM_HASH = "526b6267bfdd21cff9862ef5bd6e096e15eccc7fbd397bcc95d98e9755fe935a96ee2faad2bc0fa7496aeff2be143018479e6dac1c4521af522983dd9af118db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(shade.tex) \
texlive-shade"
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
