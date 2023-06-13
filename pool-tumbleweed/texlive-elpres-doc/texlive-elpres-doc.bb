SUMMARY = "Documentation for texlive-elpres"
DESCRIPTION = "This package includes the documentation for texlive-elpres"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn60209"

RPM_NAME = "texlive-elpres-doc-2023.201.1.0.1svn60209-53.1.noarch.rpm"
RPM_HASH = "aecaf67458185d3f39a840f682e68506eceb66c95ff3305991a1725e10836a8f7a7c62ee2d5b98a55d985ef48e926eadad567ae42debdabd4f02b0a8e8e52eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elpres-doc"

RDEPENDS:${PN} += ""

inherit rpm
