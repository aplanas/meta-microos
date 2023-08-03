SUMMARY = "Documentation for texlive-embrac"
DESCRIPTION = "This package includes the documentation for texlive-embrac"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-doc-2023.209.0.0.9asvn57814-54.1.noarch.rpm"
RPM_HASH = "9ed24e511b80e6df45031c46628d374a5ba111d044d8b9754997640929ef65b7ae466b4fe8fd9a6161665f3ac6ae3040ec01c7f186699be156617150e2f9580f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embrac-doc"

RDEPENDS:${PN} += ""

inherit rpm
