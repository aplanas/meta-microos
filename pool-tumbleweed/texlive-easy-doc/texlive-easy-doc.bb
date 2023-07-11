SUMMARY = "Documentation for texlive-easy"
DESCRIPTION = "This package includes the documentation for texlive-easy"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99svn19440"

RPM_NAME = "texlive-easy-doc-2023.201.0.0.99svn19440-53.2.noarch.rpm"
RPM_HASH = "2691d681e2557e4f8360c02a75f64744c11020cfa69f7c78c062d3e0910c056db28e4310152cd859842fac552bac4ac2339a08a7f9814933814a36a85f238b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-doc"

RDEPENDS:${PN} += ""

inherit rpm
