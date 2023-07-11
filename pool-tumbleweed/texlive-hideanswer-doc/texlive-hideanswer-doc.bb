SUMMARY = "Documentation for texlive-hideanswer"
DESCRIPTION = "This package includes the documentation for texlive-hideanswer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63852"

RPM_NAME = "texlive-hideanswer-doc-2023.201.1.1svn63852-53.2.noarch.rpm"
RPM_HASH = "a16d2a4a9f83e432735057aa0049356f58f87bde4759fccb42d24c670ba8749ae8f1b4c80eb4de84be6e57364fc211189efc0a229847b907d4787eea27a4928f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hideanswer-doc"

RDEPENDS:${PN} += ""

inherit rpm
