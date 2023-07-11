SUMMARY = "Documentation for texlive-embedall"
DESCRIPTION = "This package includes the documentation for texlive-embedall"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn51177"

RPM_NAME = "texlive-embedall-doc-2023.201.2.0svn51177-53.2.noarch.rpm"
RPM_HASH = "0b56edb57ac57baa8dd94b88351bd36251eaf47ac4df343583d39bfd7feae9cdc9c9befa0f71df8cbb614356402b4fd919f90214bd1a21d2acded00502cde206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedall-doc"

RDEPENDS:${PN} += ""

inherit rpm
