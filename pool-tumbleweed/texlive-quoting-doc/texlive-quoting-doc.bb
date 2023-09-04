SUMMARY = "Documentation for texlive-quoting"
DESCRIPTION = "This package includes the documentation for texlive-quoting"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn32818"

RPM_NAME = "texlive-quoting-doc-2023.209.0.0.1csvn32818-54.2.noarch.rpm"
RPM_HASH = "413ac8d2e032eb7281a18cc9f60a852a9e41692080313b301e7bcd6b14d8d3181e4b5e025c778a583516dcf99d150977b138aa65a965fea2febdc5f8cb950bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quoting-doc"

RDEPENDS:${PN} += ""

inherit rpm
