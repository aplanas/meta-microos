SUMMARY = "Documentation for texlive-endofproofwd"
DESCRIPTION = "This package includes the documentation for texlive-endofproofwd"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55643"

RPM_NAME = "texlive-endofproofwd-doc-2023.201.svn55643-53.1.noarch.rpm"
RPM_HASH = "3a0d66b437cee8f6540dc8a003e59304203b272098132f9058e180e6517d17e0bae6f4c661eaf01a84e2b33ea5c15fb4ed645dee4342a68c22baa3e81d938c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endofproofwd-doc"

RDEPENDS:${PN} += ""

inherit rpm
