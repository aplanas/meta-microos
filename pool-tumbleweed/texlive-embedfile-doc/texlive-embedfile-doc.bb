SUMMARY = "Documentation for texlive-embedfile"
DESCRIPTION = "This package includes the documentation for texlive-embedfile"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn65528"

RPM_NAME = "texlive-embedfile-doc-2023.201.2.12svn65528-53.2.noarch.rpm"
RPM_HASH = "2535b35784200d6fedc8090a388d162f8ed9708079c3255984e0370334ee961d8330a0b9e33937213b45f5975df403cc36de651242b949221d0c1f9e02214910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
