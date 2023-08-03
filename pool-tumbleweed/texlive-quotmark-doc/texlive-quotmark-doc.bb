SUMMARY = "Documentation for texlive-quotmark"
DESCRIPTION = "This package includes the documentation for texlive-quotmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-quotmark-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "06284c99724d21c3a4b9cb5fca19a3984372af92879a2e93f870b12118334ffa872a4464c173d907877256b48b331f1390e8d3a4216f7e93e98ff13da8602d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
