SUMMARY = "Documentation for texlive-readarray"
DESCRIPTION = "This package includes the documentation for texlive-readarray"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn60540"

RPM_NAME = "texlive-readarray-doc-2023.209.3.1svn60540-54.1.noarch.rpm"
RPM_HASH = "4134bd246c1db8ec1a05b6b670f7265da23c906c47924ba6524011c3dad1479fbd9bbf480aefafb24722e15b9dcb775cb2699277809d06d3694766708b4100b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
