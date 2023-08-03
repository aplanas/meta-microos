SUMMARY = "Documentation for texlive-flagderiv"
DESCRIPTION = "This package includes the documentation for texlive-flagderiv"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.10svn15878"

RPM_NAME = "texlive-flagderiv-doc-2023.209.0.0.10svn15878-53.1.noarch.rpm"
RPM_HASH = "c7e43ecc7f81f00ae8fd9b643a77a54c9b2443c949e1fea13f7120c13282c12347166e0d8a75b9774d86b8ba6deb6c2c9ea2b95eaaeaf5fb746e1b2865e193b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flagderiv-doc"

RDEPENDS:${PN} += ""

inherit rpm
