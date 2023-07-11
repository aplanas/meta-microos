SUMMARY = "Documentation for texlive-eplain"
DESCRIPTION = "This package includes the documentation for texlive-eplain"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.13svn64721"

RPM_NAME = "texlive-eplain-doc-2023.201.3.13svn64721-53.2.noarch.rpm"
RPM_HASH = "4f83af514f4ab8f9e7004c9b573611f4b3b15d62fbf36a9eb666fd780d759727a428e07f110e39b9166ef2f7084d03e69babe7059e0135feb7587db05be6be51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eplain.1 \
texlive-eplain-doc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh"

inherit rpm
