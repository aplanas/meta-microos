SUMMARY = "Documentation for texlive-prelim2e"
DESCRIPTION = "This package includes the documentation for texlive-prelim2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn57000"

RPM_NAME = "texlive-prelim2e-doc-2023.209.2.00svn57000-53.1.noarch.rpm"
RPM_HASH = "62a5e24058241b407220b7d8cf8bea2aae8eb5f3e882edc8c673fe3aa0b197d7eb5ef9c8456a16491deeb852e79fd53635b8a2f10c29165e8e2c673713f38e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prelim2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
