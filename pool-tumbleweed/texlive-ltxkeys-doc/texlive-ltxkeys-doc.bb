SUMMARY = "Documentation for texlive-ltxkeys"
DESCRIPTION = "This package includes the documentation for texlive-ltxkeys"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.0.3csvn28332"

RPM_NAME = "texlive-ltxkeys-doc-2023.208.0.0.0.3csvn28332-53.1.noarch.rpm"
RPM_HASH = "e6cfeedf6ca53bf3c55b994cb37f7e8bbb6861ef15c0cb3cb67e030f7043a295b50dca03d4ff83bd8f419a17657739948dcb98166ced8cd89776c7faa3062cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxkeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
