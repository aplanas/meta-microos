SUMMARY = "Documentation for texlive-yax"
DESCRIPTION = "This package includes the documentation for texlive-yax"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn54080"

RPM_NAME = "texlive-yax-doc-2023.209.1.03svn54080-53.2.noarch.rpm"
RPM_HASH = "3e9b181b39ebbdce24e40d86075dfac0db2007da6db69c4a4d910a6211c3346e9488015c26ec2b55dd60a6943820d9f34f900500b7031f627149a2b8562a0361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yax-doc"

RDEPENDS:${PN} += ""

inherit rpm
