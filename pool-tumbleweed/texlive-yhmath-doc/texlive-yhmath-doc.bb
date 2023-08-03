SUMMARY = "Documentation for texlive-yhmath"
DESCRIPTION = "This package includes the documentation for texlive-yhmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54377"

RPM_NAME = "texlive-yhmath-doc-2023.209.1.6svn54377-53.1.noarch.rpm"
RPM_HASH = "29e9871a2455a9f7940bbef7182591c727244394cc3e533f6a3f33a53fb84b89836530677069f8d68895b5bad126775f9d4eeae21cd63df7641333bf799964e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yhmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
