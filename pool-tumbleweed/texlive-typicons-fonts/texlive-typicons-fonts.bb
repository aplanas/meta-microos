SUMMARY = "Severed fonts for texlive-typicons"
DESCRIPTION = "The  separated fonts package for texlive-typicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn37623"

RPM_NAME = "texlive-typicons-fonts-2023.201.2.0.7svn37623-52.1.noarch.rpm"
RPM_HASH = "fe90d3b217355bb09cf3170c25f8ec0f7d05f16fa5a772f9757f1cc494b97a4a2df84a830f2a61c271505d97f456d1af608a16c744ced113e4374118d0025b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-typicons \
texlive-typicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
