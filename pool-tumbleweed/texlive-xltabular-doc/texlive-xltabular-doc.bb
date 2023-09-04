SUMMARY = "Documentation for texlive-xltabular"
DESCRIPTION = "This package includes the documentation for texlive-xltabular"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-doc-2023.209.0.0.2esvn56855-53.2.noarch.rpm"
RPM_HASH = "deb719db7b6eb56522555982922207c75441d3e5ddb673a3fd17a819537354e7e389c83ac437f9d53ec77a2498d6369c6615bee9fb9caf1442da58b7e4336351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
