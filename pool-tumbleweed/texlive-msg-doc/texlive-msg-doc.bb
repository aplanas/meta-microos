SUMMARY = "Documentation for texlive-msg"
DESCRIPTION = "This package includes the documentation for texlive-msg"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.51svn49578"

RPM_NAME = "texlive-msg-doc-2023.201.0.0.51svn49578-54.1.noarch.rpm"
RPM_HASH = "5cf4a391491da4b5a511b25a601cb6857e219b5cc144819509238d2dfc82be65153372cd16e7c413deb8a412c58bda3e7d9540c8c91bcbda9109221021cc28b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msg-doc"

RDEPENDS:${PN} += ""

inherit rpm
