SUMMARY = "Documentation for texlive-hologo"
DESCRIPTION = "This package includes the documentation for texlive-hologo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn61719"

RPM_NAME = "texlive-hologo-doc-2023.209.1.15svn61719-54.1.noarch.rpm"
RPM_HASH = "97eea24dd1b9eaa8ba4f8ee7fdaff6beb5bfe27fa366503081cc364d53436ac2cfbbfb52cd0090c8e46608ae9397d5badece854900ebc25ea3990bac9669f0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hologo-doc"

RDEPENDS:${PN} += ""

inherit rpm
