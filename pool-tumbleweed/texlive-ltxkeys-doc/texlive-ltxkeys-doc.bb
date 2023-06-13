SUMMARY = "Documentation for texlive-ltxkeys"
DESCRIPTION = "This package includes the documentation for texlive-ltxkeys"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.3csvn28332"

RPM_NAME = "texlive-ltxkeys-doc-2023.201.0.0.0.3csvn28332-52.1.noarch.rpm"
RPM_HASH = "aa57e96047280f8ff305eb5f88f38548eb3608d881a5df689045d22fe53bfb5830180622a5452290bd69b3ae3a71a7ef1aba203c32603b93f860d30014d31f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxkeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
