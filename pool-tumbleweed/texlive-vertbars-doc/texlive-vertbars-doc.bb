SUMMARY = "Documentation for texlive-vertbars"
DESCRIPTION = "This package includes the documentation for texlive-vertbars"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn49429"

RPM_NAME = "texlive-vertbars-doc-2023.201.1.0csvn49429-53.1.noarch.rpm"
RPM_HASH = "220876f777143e12bd665201bbca1a8b34ab8599182f7c93f92808ae93f451060983b890616f7c6f2b2e697548dbb680b7d0100d08b24182dd607a72f010e849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vertbars-doc"

RDEPENDS:${PN} += ""

inherit rpm
