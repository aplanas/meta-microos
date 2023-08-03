SUMMARY = "Documentation for texlive-ecc"
DESCRIPTION = "This package includes the documentation for texlive-ecc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ecc-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "6d14600c1ae5b900c4702cce341616865ac98fdab4f833a0ab77a5aeba4229239d8c5bd1bf466cd9f57cb9913b0a3d7162f7c729c69f28d72dfac4971452486d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecc-doc"

RDEPENDS:${PN} += ""

inherit rpm
