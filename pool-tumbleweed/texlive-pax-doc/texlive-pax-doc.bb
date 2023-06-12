SUMMARY = "Documentation for texlive-pax"
DESCRIPTION = "This package includes the documentation for texlive-pax"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63509"

RPM_NAME = "texlive-pax-doc-2023.201.svn63509-51.1.noarch.rpm"
RPM_HASH = "320a1eb302aa4d9ece036778eee9f5f3d91e1fd93a570c62c143f4aff5ca4895265979754edc7270c87bde468d68b85711aa7b942694f2bdedf5392fe02a2781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pax-doc"
RDEPENDS:${PN} += ""

inherit rpm
