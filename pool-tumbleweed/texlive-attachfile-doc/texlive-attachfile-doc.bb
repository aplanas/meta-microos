SUMMARY = "Documentation for texlive-attachfile"
DESCRIPTION = "This package includes the documentation for texlive-attachfile"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn42099"

RPM_NAME = "texlive-attachfile-doc-2023.201.1.9svn42099-53.1.noarch.rpm"
RPM_HASH = "dce570b90d3aedc25ef8da71c0eb6274b3ce9528aeb6d862b843517138061b8e201a9e94d5c9294d806b7396d01b225d2c690abaf380f28fd30ceeca492534d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-attachfile-doc"
RDEPENDS:${PN} += ""

inherit rpm
