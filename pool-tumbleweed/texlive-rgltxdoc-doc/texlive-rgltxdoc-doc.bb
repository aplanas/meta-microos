SUMMARY = "Documentation for texlive-rgltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-rgltxdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-doc-2023.201.1.3svn53858-53.1.noarch.rpm"
RPM_HASH = "800a6cf77d96bc16e9be34a27822e311c2bc332c5ce47d301bab4fb08ae53da0a627249c23756f2edf9be5c5daeb2e0741ac85a4060cb0f37f523b3ea50f894b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rgltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
