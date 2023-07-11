SUMMARY = "Documentation for texlive-gmiflink"
DESCRIPTION = "This package includes the documentation for texlive-gmiflink"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-doc-2023.201.0.0.97svn15878-53.2.noarch.rpm"
RPM_HASH = "f54c46c41cdde411001735e8ea344aa06b6c209c9b5e00b4954616f9b9bdffeff58808ed0c93e089a7188ae9b0e9b59d4b5c05e11929306fc6ae285e7d1e6bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmiflink-doc"

RDEPENDS:${PN} += ""

inherit rpm
