SUMMARY = "Severed fonts for texlive-marvosym"
DESCRIPTION = "The  separated fonts package for texlive-marvosym"
LICENSE = "OFL-1.1"

PV = "2023.201.2.2asvn29349"

RPM_NAME = "texlive-marvosym-fonts-2023.201.2.2asvn29349-52.1.noarch.rpm"
RPM_HASH = "90062df931c10a0bcbceff9b70e46a94938ca3efa086c23ddbfc2544fe37f4bbf778f8debb25369ec1c6ed715305d6cf97c41bf4dd0515af592bd7a3d1a9c5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-marvosym-fonts \
font-marvosym \
font-marvosymwithtexsupport \
texlive-marvosym-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
