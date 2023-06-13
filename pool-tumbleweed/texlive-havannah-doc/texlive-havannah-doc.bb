SUMMARY = "Documentation for texlive-havannah"
DESCRIPTION = "This package includes the documentation for texlive-havannah"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36348"

RPM_NAME = "texlive-havannah-doc-2023.201.svn36348-53.1.noarch.rpm"
RPM_HASH = "f60d0dba99cfdbd1ffe2f113ebaa0455fd1df360744fcbe2abb7c8d96e27fa815811ab12ecc6b9947b593fc447841912aa29478f964ac843d23c912fa838a861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-havannah-doc"

RDEPENDS:${PN} += ""

inherit rpm
