SUMMARY = "Documentation for texlive-svrsymbols"
DESCRIPTION = "This package includes the documentation for texlive-svrsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-doc-2023.209.2.0bsvn50019-58.1.noarch.rpm"
RPM_HASH = "90b581c8ba0289d4da6863f3e089ecd5b8ed4a2c422f41e0026d53f4ffaf6ee882d897ce7f694389053146d51050836a27f9ccf43546f3118b2764b8654e919c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svrsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
