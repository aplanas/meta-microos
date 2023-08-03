SUMMARY = "Running PSTricks under XeTeX"
DESCRIPTION = "The package provides an indirection scheme for XeTeX to use the \
pstricks xdvipdfmx.cfg configuration file, so that XeTeX \
documents will load it in preference to the standard \
pstricks.con configuration file. With this configuration, many \
PSTricks features can be used in XeLaTeX or plain XeTeX \
documents."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17055"

RPM_NAME = "texlive-xetex-pstricks-2023.209.svn17055-53.1.noarch.rpm"
RPM_HASH = "820fb850d3a99afb7afa9ba1a9d1198cab9b5005f0f61d2021404102f140b1dbe162c896dd3b20a815b6e31f6507db50f586f6aa61e5d67514551d36eb3c829f"
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
