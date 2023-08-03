SUMMARY = "Documentation for texlive-cmpica"
DESCRIPTION = "This package includes the documentation for texlive-cmpica"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cmpica-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "7e10900687588924014c53d22d29e3d0767cf8a6d6361e7cfd8937d49747a8dd8236edb9cfa099f45c8e2891ec2f3726c3ba0b5098bade4a06d778d45b9039dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmpica-doc"

RDEPENDS:${PN} += ""

inherit rpm
