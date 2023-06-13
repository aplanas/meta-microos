SUMMARY = "Documentation for texlive-courierten"
DESCRIPTION = "This package includes the documentation for texlive-courierten"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn55436"

RPM_NAME = "texlive-courierten-doc-2023.204.svn55436-54.1.noarch.rpm"
RPM_HASH = "14ebf3682139f343b2e415d64e03ca6316bc54def6c4417f9751e359a40e14b63abce02aa09ad88bffc59af88fa6086516410afce1282ad0b8dc4e07460be0d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courierten-doc"

RDEPENDS:${PN} += ""

inherit rpm
