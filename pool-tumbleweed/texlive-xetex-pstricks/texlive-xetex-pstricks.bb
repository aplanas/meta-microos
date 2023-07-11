SUMMARY = "Running PSTricks under XeTeX"
DESCRIPTION = "The package provides an indirection scheme for XeTeX to use the \
pstricks xdvipdfmx.cfg configuration file, so that XeTeX \
documents will load it in preference to the standard \
pstricks.con configuration file. With this configuration, many \
PSTricks features can be used in XeLaTeX or plain XeTeX \
documents."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17055"

RPM_NAME = "texlive-xetex-pstricks-2023.201.svn17055-52.2.noarch.rpm"
RPM_HASH = "390183436bafb33cdae5e53856250e086017dc7515690c02dbb7706cf389d58690ba5b7ebd7b9ded11d7b4af02e193ae9dffed651e8b5bc3891b289543d55e22"
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
