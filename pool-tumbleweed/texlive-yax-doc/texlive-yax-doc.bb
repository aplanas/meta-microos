SUMMARY = "Documentation for texlive-yax"
DESCRIPTION = "This package includes the documentation for texlive-yax"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn54080"

RPM_NAME = "texlive-yax-doc-2023.209.1.03svn54080-53.1.noarch.rpm"
RPM_HASH = "cf4c860962a4abbf54b963f7fac5438f9ee5555c54eaa402b9a95f9f888791c4db99f021fb5e7e9e6e5d48b0baf30fda8a84ae38d484232a2103facb5cca3a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yax-doc"

RDEPENDS:${PN} += ""

inherit rpm
