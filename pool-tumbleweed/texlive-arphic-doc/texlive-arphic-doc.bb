SUMMARY = "Documentation for texlive-arphic"
DESCRIPTION = "This package includes the documentation for texlive-arphic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-arphic-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "2b366e5770bba750a8e9d870634b44ea58d40917c90a0f7965bc8af3eec27edc19bb15b904f38628a0147a0766a6efa3aa6bc49fa902a71c41e605fb043778d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
