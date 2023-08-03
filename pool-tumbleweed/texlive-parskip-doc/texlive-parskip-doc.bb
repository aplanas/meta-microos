SUMMARY = "Documentation for texlive-parskip"
DESCRIPTION = "This package includes the documentation for texlive-parskip"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0hsvn58358"

RPM_NAME = "texlive-parskip-doc-2023.209.2.0hsvn58358-52.1.noarch.rpm"
RPM_HASH = "2acf73a32291d28ea03dcf0fcdf59da68c003115bbf29ea8b512680e8fd3264f2699024f139aace9b04ef22212f317ef15e252bf50f2edf93b55a953812edd99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
