SUMMARY = "Documentation for texlive-morewrites"
DESCRIPTION = "This package includes the documentation for texlive-morewrites"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49531"

RPM_NAME = "texlive-morewrites-doc-2023.209.svn49531-55.1.noarch.rpm"
RPM_HASH = "a37f488ea7424bdb1fd170e3f9c6c1c8e132216532be3d5d1252e993c9faa6d6053910f2b3d1e5b96c9c79095b30d46f95fa8b40e28c67b163e9fe505e3be578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morewrites-doc"

RDEPENDS:${PN} += ""

inherit rpm
