SUMMARY = "Documentation for texlive-doclicense"
DESCRIPTION = "This package includes the documentation for texlive-doclicense"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn63340"

RPM_NAME = "texlive-doclicense-doc-2023.209.3.2.0svn63340-53.1.noarch.rpm"
RPM_HASH = "e4c8ac1f3b72524066ab16174cac30843565f8e03121ee1cf57ed9e091e85d4686714af799423ed4943d19fee9fe8721a5e34941d1ae4794d6f58acc044ed579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doclicense-doc"

RDEPENDS:${PN} += ""

inherit rpm
