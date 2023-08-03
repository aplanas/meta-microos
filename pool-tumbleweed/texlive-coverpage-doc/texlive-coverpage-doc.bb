SUMMARY = "Documentation for texlive-coverpage"
DESCRIPTION = "This package includes the documentation for texlive-coverpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn63509"

RPM_NAME = "texlive-coverpage-doc-2023.209.1.01svn63509-55.1.noarch.rpm"
RPM_HASH = "825dc2a4f314be4ffbed6f31c0ce9bf2a754e9b6ccbf80bd2db4c454637d95de98a2e7abd85551cb15b5a48c8d96a0ff6c6797e8775f9e4ea018c5120c6b0e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coverpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
