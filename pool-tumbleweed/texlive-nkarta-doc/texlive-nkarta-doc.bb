SUMMARY = "Documentation for texlive-nkarta"
DESCRIPTION = "This package includes the documentation for texlive-nkarta"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn16437"

RPM_NAME = "texlive-nkarta-doc-2023.201.0.0.2svn16437-54.1.noarch.rpm"
RPM_HASH = "c4daccb4fd06bde5cb95922e666b09e868af5682b45939e57decb3715fe05e25b438aaf4be3d04c84585ed04957557759a473c4e3265c0b8bee430c514f2409e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nkarta-doc"

RDEPENDS:${PN} += ""

inherit rpm
