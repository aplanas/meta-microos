SUMMARY = "Documentation for texlive-librarian"
DESCRIPTION = "This package includes the documentation for texlive-librarian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19880"

RPM_NAME = "texlive-librarian-doc-2023.201.1.0svn19880-54.1.noarch.rpm"
RPM_HASH = "6a3715033370eb09e1e1c15abd191ce79bc352d78a31ba4ee56a3714aca0ec0bbf30b54a52a87f822af6e0d03c33bb76414cb9cece1296b3bc891ee5733716c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
