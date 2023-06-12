SUMMARY = "Severed fonts for texlive-ccicons"
DESCRIPTION = "The  separated fonts package for texlive-ccicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54512"

RPM_NAME = "texlive-ccicons-fonts-2023.201.1.6svn54512-52.1.noarch.rpm"
RPM_HASH = "d3f35472d238f1e3a6f29c9b3580ae27695aa1f00e1a399c284d42f2b45b6435d599e4a9fde149b42e2ed5fcfe2a8ea73f91e293ae2eb000c0f0fe535b4e0e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-ccicons-fonts) \
font(ccicons) \
texlive-ccicons-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
