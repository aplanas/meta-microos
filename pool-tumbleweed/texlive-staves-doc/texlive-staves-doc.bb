SUMMARY = "Documentation for texlive-staves"
DESCRIPTION = "This package includes the documentation for texlive-staves"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-staves-doc-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "b124b0ee1cbe13ccb964e7981486b28ebfe4eb680b3fa1c74a4161f00d68a7767830ddc3d80c496385eb1edbfd312e263b452e661f0a3e0717e6fe999da8141c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-staves-doc"

RDEPENDS:${PN} += ""

inherit rpm
