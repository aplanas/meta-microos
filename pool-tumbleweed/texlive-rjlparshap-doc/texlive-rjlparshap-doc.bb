SUMMARY = "Documentation for texlive-rjlparshap"
DESCRIPTION = "This package includes the documentation for texlive-rjlparshap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "153b835f795a742c47126ac961e567406c88feb6c826487d8ac13f85fa012c56014693046c60910787956cd426d08eb81af366f4fec0ffa6251a9e8c97939dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rjlparshap-doc"

RDEPENDS:${PN} += ""

inherit rpm
