SUMMARY = "Documentation for texlive-simple-resume-cv"
DESCRIPTION = "This package includes the documentation for texlive-simple-resume-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn43057"

RPM_NAME = "texlive-simple-resume-cv-doc-2023.209.svn43057-54.1.noarch.rpm"
RPM_HASH = "f0b3fddca5a7104312cffa745fc7d5da8f1489a2d5b27ac37f09568c07dffa72567e09bccbbdb601b907c2562677e4d561ad9161c585fca87c61939329cad48e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simple-resume-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
