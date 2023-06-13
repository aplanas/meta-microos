SUMMARY = "Documentation for texlive-unitn-bimrep"
DESCRIPTION = "This package includes the documentation for texlive-unitn-bimrep"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45581"

RPM_NAME = "texlive-unitn-bimrep-doc-2023.201.svn45581-53.1.noarch.rpm"
RPM_HASH = "612a6708b410b1920767fd254dea176378f0bb09ba8df117b5554d1980d8e25581f6c8639b7a3b51b6dd772adff4927f246d4320dd76f5bf053c7ef60c3cd808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitn-bimrep-doc"

RDEPENDS:${PN} += ""

inherit rpm
