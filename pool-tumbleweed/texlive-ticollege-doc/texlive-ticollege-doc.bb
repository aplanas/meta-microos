SUMMARY = "Documentation for texlive-ticollege"
DESCRIPTION = "This package includes the documentation for texlive-ticollege"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36306"

RPM_NAME = "texlive-ticollege-doc-2023.201.1.0svn36306-54.1.noarch.rpm"
RPM_HASH = "9d7d9628946e633db5c38dc2047d5a813837f556f11771e338d75cee3d74f1453d055cb72d9ad662234c29242e855675bf0b68a48126062bfd546281fa89091d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ticollege-doc:fr) \
texlive-ticollege-doc"

RDEPENDS:${PN} += ""

inherit rpm
