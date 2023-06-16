SUMMARY = "Running PSTricks under XeTeX"
DESCRIPTION = "The package provides an indirection scheme for XeTeX to use the \
pstricks xdvipdfmx.cfg configuration file, so that XeTeX \
documents will load it in preference to the standard \
pstricks.con configuration file. With this configuration, many \
PSTricks features can be used in XeLaTeX or plain XeTeX \
documents."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17055"

RPM_NAME = "texlive-xetex-pstricks-2023.201.svn17055-52.1.noarch.rpm"
RPM_HASH = "c80fe7cf86a9c33d928d637844ab468f4696078a19e3174cbed19333cc1032c165a58d73384fde4c726d51891ef79298edac5298c6d8a2e39bdcce61f3d5eac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks"

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
