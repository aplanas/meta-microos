SUMMARY = "Documentation for texlive-insbox"
DESCRIPTION = "This package includes the documentation for texlive-insbox"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.2svn34299"

RPM_NAME = "texlive-insbox-doc-2023.201.2.2svn34299-52.1.noarch.rpm"
RPM_HASH = "688f9d7a2cddd3a2f9373ae1485368d37b8891ee33c6c9b55502f876f8f7ba566845115ba6c81506bf22ed3cffd64a4375848c9c53d1fe71c8b3ac3322b32987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-insbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
