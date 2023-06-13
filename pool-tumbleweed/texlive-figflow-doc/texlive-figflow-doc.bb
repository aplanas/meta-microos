SUMMARY = "Documentation for texlive-figflow"
DESCRIPTION = "This package includes the documentation for texlive-figflow"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21462"

RPM_NAME = "texlive-figflow-doc-2023.201.svn21462-52.1.noarch.rpm"
RPM_HASH = "bc44a2f8e1a59c0aeab9e2e1302183a4ad0694394dd3cf227a8a45b8b26ec9c17283c63873fd04528d4805a081d9ed53b71674bd7420b5ca6757f1dd68645894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
