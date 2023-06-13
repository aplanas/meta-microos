SUMMARY = "Documentation for texlive-chronology"
DESCRIPTION = "This package includes the documentation for texlive-chronology"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn37934"

RPM_NAME = "texlive-chronology-doc-2023.201.1.1.1svn37934-53.1.noarch.rpm"
RPM_HASH = "9a820d78713ac7a021fbe67f3f3cd0eb90dec5f7d385e998aadc52294c73acce980404328094d549029b0344f43586eb692a14e9c65159d90de000d36863798f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chronology-doc"

RDEPENDS:${PN} += ""

inherit rpm
