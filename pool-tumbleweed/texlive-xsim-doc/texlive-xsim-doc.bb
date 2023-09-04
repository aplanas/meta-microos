SUMMARY = "Documentation for texlive-xsim"
DESCRIPTION = "This package includes the documentation for texlive-xsim"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn61988"

RPM_NAME = "texlive-xsim-doc-2023.209.0.0.21svn61988-53.2.noarch.rpm"
RPM_HASH = "e1b6eea47beb58ca1ad778b40e7c4220f5dca2c64b81ad687695b419e580acf5b1aa9f9cc5fe9cc8ece163303b05587d5c0538151bba72290e5d523fe7b82dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsim-doc"

RDEPENDS:${PN} += ""

inherit rpm
