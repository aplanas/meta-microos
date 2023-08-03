SUMMARY = "Documentation for texlive-sistyle"
DESCRIPTION = "This package includes the documentation for texlive-sistyle"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3asvn59682"

RPM_NAME = "texlive-sistyle-doc-2023.209.2.3asvn59682-58.1.noarch.rpm"
RPM_HASH = "ea5a0c3da63e2839b440f8271af900a43218c094566b943dedff4c3a63ac8a5138b81cfac53554b6ebcd106eec890862df35ad6d0c767dc388357c5d7e88a5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sistyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
