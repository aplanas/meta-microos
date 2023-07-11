SUMMARY = "Documentation for texlive-zhmetrics"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics"
LICENSE = "LPPL-1.0"

PV = "2023.201.r206svn22207"

RPM_NAME = "texlive-zhmetrics-doc-2023.201.r206svn22207-52.2.noarch.rpm"
RPM_HASH = "56c6c5c80ac5b79f159858a48aa7279b45c23f250d0d50b076f405d3c9fbf3e641e84eb30d04fd41d0f939316fa2bce9a885b483da54040a274aa97fca2d714f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
