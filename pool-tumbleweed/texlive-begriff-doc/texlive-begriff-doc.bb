SUMMARY = "Documentation for texlive-begriff"
DESCRIPTION = "This package includes the documentation for texlive-begriff"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn15878"

RPM_NAME = "texlive-begriff-doc-2023.209.1.6svn15878-54.1.noarch.rpm"
RPM_HASH = "70188ebcdfeacc02284a43df276c93fa24e2fdfbe42ac3da9e54c50a07ee9a9cad3e11c931a643207b7881054d53a75f6b6cab61673fe2cdb1a2ab96ce825dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-begriff-doc"

RDEPENDS:${PN} += ""

inherit rpm
