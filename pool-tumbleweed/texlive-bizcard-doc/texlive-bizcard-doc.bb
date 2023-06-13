SUMMARY = "Documentation for texlive-bizcard"
DESCRIPTION = "This package includes the documentation for texlive-bizcard"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-bizcard-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "dcfd8ba370e45637dba2d6c273ac130f4a31bfa917d092f3ecf69a5af0b256e0fdcead8a8fa9b73a74705de97e1167bcde3e9af8bf16146acd6ba6af93525473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bizcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
