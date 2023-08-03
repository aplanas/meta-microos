SUMMARY = "Documentation for texlive-pdfslide"
DESCRIPTION = "This package includes the documentation for texlive-pdfslide"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pdfslide-doc-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "f38ab4cd9af2cef3e72476df0dd7dcc24b8216fe621c1f55029f9db6cbef5505164b253fdce7980f153b9d1b85b82a6ffabf48b35d50b533aea775098ac39ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
