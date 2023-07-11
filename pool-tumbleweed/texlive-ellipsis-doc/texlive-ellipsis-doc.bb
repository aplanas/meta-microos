SUMMARY = "Documentation for texlive-ellipsis"
DESCRIPTION = "This package includes the documentation for texlive-ellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn55418"

RPM_NAME = "texlive-ellipsis-doc-2023.201.1.8svn55418-53.2.noarch.rpm"
RPM_HASH = "0d03f53c6c962f01c7128410af19db57075a6ea865096f82c9ebe4b4089aec346de776749bd4d33ef6eb70dd5e3ad3479d1b881881c7581b4ba806f69dc93d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
