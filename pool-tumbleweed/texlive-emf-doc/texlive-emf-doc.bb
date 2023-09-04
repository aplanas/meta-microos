SUMMARY = "Documentation for texlive-emf"
DESCRIPTION = "This package includes the documentation for texlive-emf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn42023"

RPM_NAME = "texlive-emf-doc-2023.209.1svn42023-54.2.noarch.rpm"
RPM_HASH = "c1b285bc543168ba620ad2548755915c0a2e0c4545fd11864d22b99ecdc5f920b49d4bb3301494d33c2ab765d579dd61a1f97042231f27cccb7b600b1a12a759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emf-doc"

RDEPENDS:${PN} += ""

inherit rpm
