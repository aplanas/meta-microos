SUMMARY = "Documentation for texlive-fitbox"
DESCRIPTION = "This package includes the documentation for texlive-fitbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn50088"

RPM_NAME = "texlive-fitbox-doc-2023.209.1.02svn50088-53.1.noarch.rpm"
RPM_HASH = "1794e90f75547d0392e8b7eee13cf1d8981be933a2f782ddd05ad71101ec42cda39f81399af21faaee237ceaa1351e643b7bcdb015eb555a244c50c1716e22fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fitbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
