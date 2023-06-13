SUMMARY = "Documentation for texlive-brandeis-dissertation"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-dissertation"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13svn61215"

RPM_NAME = "texlive-brandeis-dissertation-doc-2023.201.3.13svn61215-52.1.noarch.rpm"
RPM_HASH = "0ff167811eedeada7daf5a88b3a3694e7a3d4267f035e3edeefedea6a81653139e3889f50ba8010e5a4118da4a6672c5678687979d3409f79dc2913322e78d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-dissertation-doc"

RDEPENDS:${PN} += ""

inherit rpm
