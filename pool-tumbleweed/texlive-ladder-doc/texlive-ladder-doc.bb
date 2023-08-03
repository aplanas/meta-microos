SUMMARY = "Documentation for texlive-ladder"
DESCRIPTION = "This package includes the documentation for texlive-ladder"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44394"

RPM_NAME = "texlive-ladder-doc-2023.209.svn44394-56.1.noarch.rpm"
RPM_HASH = "d42f5529a3aa2dbe55d752e31065f72441c24b87a014cc9fad355981906b69fc8415a39590c5661f34760850ec0d61e76d2956bdf54c17f90cdadb835ca4fc55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ladder-doc"

RDEPENDS:${PN} += ""

inherit rpm
