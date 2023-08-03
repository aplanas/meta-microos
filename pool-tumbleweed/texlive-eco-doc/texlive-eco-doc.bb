SUMMARY = "Documentation for texlive-eco"
DESCRIPTION = "This package includes the documentation for texlive-eco"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn29349"

RPM_NAME = "texlive-eco-doc-2023.209.1.3svn29349-54.1.noarch.rpm"
RPM_HASH = "2f578303776e0141b402f960de5839159d13dac149fc7c97d851476ce245bf319d40d33a04c57d3c41d9a0c6e06b07cfede0c809f4f5cacc4d56deb56cbf82eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eco-doc"

RDEPENDS:${PN} += ""

inherit rpm
