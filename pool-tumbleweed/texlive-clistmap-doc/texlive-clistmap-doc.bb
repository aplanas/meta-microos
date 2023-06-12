SUMMARY = "Documentation for texlive-clistmap"
DESCRIPTION = "This package includes the documentation for texlive-clistmap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61811"

RPM_NAME = "texlive-clistmap-doc-2023.201.1.2svn61811-53.1.noarch.rpm"
RPM_HASH = "9d90bd4b46fddb740e3404c0d9e5d7beb9d184cc29c59261486b745557583d59f706ffcf85fc9155c002b423f9eb3f9c090d42f4e4f65cde764b4407bac8526a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clistmap-doc"
RDEPENDS:${PN} += ""

inherit rpm
