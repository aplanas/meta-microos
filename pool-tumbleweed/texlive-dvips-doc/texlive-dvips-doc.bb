SUMMARY = "Documentation for texlive-dvips"
DESCRIPTION = "This package includes the documentation for texlive-dvips"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-dvips-doc-2023.201.svn66203-53.2.noarch.rpm"
RPM_HASH = "ad6c9b495d4f7b26fa20dd0b0408a0a3a1e045683155a9ad546097b64fc61396f58f2d768ddcb2d891d86e2df89aece37ec316a4837d217eaa4a1fd4ce624d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2tfm.1 \
man-dvips.1 \
texlive-dvips-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
