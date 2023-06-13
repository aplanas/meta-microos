SUMMARY = "Documentation for texlive-hamnosys"
DESCRIPTION = "This package includes the documentation for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-doc-2023.201.1.0.3svn61941-53.1.noarch.rpm"
RPM_HASH = "ceed5da9f5b8aabd1561fc58681f7400cd873f14c456872f97760402c995143a5b32c87a5b0c056ce4022e0edce22a8c8b96833ee21f70064db284dd6baa5dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hamnosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
