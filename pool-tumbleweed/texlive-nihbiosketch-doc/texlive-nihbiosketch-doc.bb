SUMMARY = "Documentation for texlive-nihbiosketch"
DESCRIPTION = "This package includes the documentation for texlive-nihbiosketch"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54191"

RPM_NAME = "texlive-nihbiosketch-doc-2023.209.svn54191-55.1.noarch.rpm"
RPM_HASH = "669408267303d5c914d1e71d490138a227856834515210fb04bf4d82069b13bcd8a1257cfe4d55688b3b825ac45608b59739a155f2a9a5cc59bffeb80dd73876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nihbiosketch-doc"

RDEPENDS:${PN} += ""

inherit rpm
