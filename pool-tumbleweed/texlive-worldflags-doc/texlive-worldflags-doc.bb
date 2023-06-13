SUMMARY = "Documentation for texlive-worldflags"
DESCRIPTION = "This package includes the documentation for texlive-worldflags"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59171"

RPM_NAME = "texlive-worldflags-doc-2023.201.svn59171-53.1.noarch.rpm"
RPM_HASH = "25255e32359c6bd0c6e69bdd2d1d603c349876f25f5a93691ab847ad8258fd22c72f9c90ab0d5f6519b61908d3aaef09b291d1253437f23f7b59cf307466a5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-worldflags-doc"

RDEPENDS:${PN} += ""

inherit rpm
