SUMMARY = "Documentation for texlive-xcookybooky"
DESCRIPTION = "This package includes the documentation for texlive-xcookybooky"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-doc-2023.209.1.5svn36435-53.2.noarch.rpm"
RPM_HASH = "7c1544cb33110da33fdb2d331485ffd665569151871274288ba5bbebfbb4162b54885f296c43d70c7ceea17cda3fc28b24a2f01ed2155bd3545ed3514e1f1dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcookybooky-doc"

RDEPENDS:${PN} += ""

inherit rpm
