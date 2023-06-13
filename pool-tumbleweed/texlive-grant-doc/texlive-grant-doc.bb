SUMMARY = "Documentation for texlive-grant"
DESCRIPTION = "This package includes the documentation for texlive-grant"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-doc-2023.201.0.0.0.5svn56852-53.1.noarch.rpm"
RPM_HASH = "7475a72d34e175adb16a520647f9769b9ee6ed7270a8adcd7a7bc5c8715e9eed81b6f9a5ab9d5342325e7caf2add07fbadd993c2077360b9cb855fec1ea04bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grant-doc"

RDEPENDS:${PN} += ""

inherit rpm
