SUMMARY = "Documentation for texlive-stix2-type1"
DESCRIPTION = "This package includes the documentation for texlive-stix2-type1"
LICENSE = "OFL-1.1"

PV = "2023.201.2.0.2svn57448"

RPM_NAME = "texlive-stix2-type1-doc-2023.201.2.0.2svn57448-57.1.noarch.rpm"
RPM_HASH = "295ca8d25ca3f683e349c4e28f9bf1a8a455c824ff65bbe4daf89a6cd9920832e5c374e22af9920a172acc510ba4413edf35055922a9503b453f75e6ef5662e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
