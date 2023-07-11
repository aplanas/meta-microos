SUMMARY = "Documentation for texlive-gridpapers"
DESCRIPTION = "This package includes the documentation for texlive-gridpapers"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-doc-2023.201.1.0.2svn58723-53.2.noarch.rpm"
RPM_HASH = "4759be7dbd9217f027b841c4d3687fddd7ec223c1bffa31c104ecff257d0f1388a052ab13480da919265e8d363a4e7010a577ca9f36b7a53f0afa8ce9770f3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
