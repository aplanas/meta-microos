SUMMARY = "Documentation for texlive-cfr-initials"
DESCRIPTION = "This package includes the documentation for texlive-cfr-initials"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn61719"

RPM_NAME = "texlive-cfr-initials-doc-2023.209.1.01svn61719-53.1.noarch.rpm"
RPM_HASH = "719073a0db7b293f9e23d04c00e8b354fd5e5c2cd3bf469a0a9fbd9e156f828f39aed35cb26e536d6bc85821c379d1d1483089c05078e57de2f01595dc08699b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cfr-initials-doc"

RDEPENDS:${PN} += ""

inherit rpm
