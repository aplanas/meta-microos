SUMMARY = "Documentation for texlive-lato"
DESCRIPTION = "This package includes the documentation for texlive-lato"
LICENSE = "OFL-1.1"

PV = "2023.209.3.3svn54512"

RPM_NAME = "texlive-lato-doc-2023.209.3.3svn54512-55.1.noarch.rpm"
RPM_HASH = "2894571b2ef4ca0cee5f037fa313324321e8ffac3c3328c6da2c2afd9a759beda19eeea48719838a4a56912f789254202989a81a7ad5f07c336d0193e8c36a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lato-doc"

RDEPENDS:${PN} += ""

inherit rpm
