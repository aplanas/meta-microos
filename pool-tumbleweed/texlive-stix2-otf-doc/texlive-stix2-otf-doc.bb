SUMMARY = "Documentation for texlive-stix2-otf"
DESCRIPTION = "This package includes the documentation for texlive-stix2-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.2.12svn58735"

RPM_NAME = "texlive-stix2-otf-doc-2023.201.2.12svn58735-57.1.noarch.rpm"
RPM_HASH = "7ec5aa8e3d0beb64794ab91e13fe24be0c9ab25e356cc666d1a7e23281c1fe25e00937a7f1e0a4147621c97d73cc6497828ddd1aed37aa9bb0860eaac2690a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
