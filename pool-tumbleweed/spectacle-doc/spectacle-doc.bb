SUMMARY = "Documentation for Spectacle"
DESCRIPTION = "This package contains the documentation available for Spectacle, which is a \
screenshot capture program by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "spectacle-doc-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e05c5f79f02273a83a9da5496c3da113c93ac58431bb4d682ce7b6bf0f20bdad0af3b86a7b25bb2dc796511cd3ae03229e500893fe7e158f9624ae6991203a43"

RPROVIDES:${PN} += "spectacle-doc"

RDEPENDS:${PN} += "spectacle"

inherit rpm
