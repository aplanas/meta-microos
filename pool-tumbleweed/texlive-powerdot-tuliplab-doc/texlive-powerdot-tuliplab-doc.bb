SUMMARY = "Documentation for texlive-powerdot-tuliplab"
DESCRIPTION = "This package includes the documentation for texlive-powerdot-tuliplab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn47963"

RPM_NAME = "texlive-powerdot-tuliplab-doc-2023.209.1.0.0svn47963-53.1.noarch.rpm"
RPM_HASH = "5c64a5efc7edd3bcf450e111e1d74ae7eebc7b9fcbfcdc2955a3874bf876659529b08304924b89c86ebd94b8c5ccb2d84af33dd6ebf988cc5aae8f12a982e2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-powerdot-tuliplab-doc"

RDEPENDS:${PN} += ""

inherit rpm
