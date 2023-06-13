SUMMARY = "Documentation for texlive-pst-flags"
DESCRIPTION = "This package includes the documentation for texlive-pst-flags"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65501"

RPM_NAME = "texlive-pst-flags-doc-2023.201.svn65501-52.1.noarch.rpm"
RPM_HASH = "ab22380b8f1e2c078c5f8e3c722d62d934f9665ef3675ed9cb6dd20508246568388945363fdf0ce522f1d2c25649d77a01e4eb6617a46c47f7b059b0148dc2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-flags-doc"

RDEPENDS:${PN} += ""

inherit rpm
