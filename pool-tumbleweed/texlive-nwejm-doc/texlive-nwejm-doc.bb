SUMMARY = "Documentation for texlive-nwejm"
DESCRIPTION = "This package includes the documentation for texlive-nwejm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.5svn64462"

RPM_NAME = "texlive-nwejm-doc-2023.209.1.0.5svn64462-55.1.noarch.rpm"
RPM_HASH = "0af94537c0706ca8e5a3cdaa315bf0b106a78ebef4062e945c817275630a59f99d7a939e423703ea726aba1b5aa2af7fb40a4b74701ed98855d71efbd4cbe834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nwejm-doc-fr \
texlive-nwejm-doc"

RDEPENDS:${PN} += ""

inherit rpm
