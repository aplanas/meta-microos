SUMMARY = "Documentation for texlive-returntogrid"
DESCRIPTION = "This package includes the documentation for texlive-returntogrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-doc-2023.209.0.0.2svn48485-54.1.noarch.rpm"
RPM_HASH = "ed0a92781d01894309acbf1ea71269085447df56e366d733db2e42d5593a0038113883a95b5b7c393a6fcd2ffed4872e969006c74fcebc6f7d13d24f9cfe14ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-returntogrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
