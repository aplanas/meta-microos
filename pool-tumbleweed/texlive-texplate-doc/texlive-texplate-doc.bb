SUMMARY = "Documentation for texlive-texplate"
DESCRIPTION = "This package includes the documentation for texlive-texplate"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.4svn61719"

RPM_NAME = "texlive-texplate-doc-2023.209.1.0.4svn61719-55.1.noarch.rpm"
RPM_HASH = "262173f547144331bb9e52f5bf3c1bb46b427caa7d5fdf3c1582628efe72cae0e2c97773efdee683c6bfcdc5ab0f2b7ec961d68fec68fee6363aa0263a4d99a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texplate-doc"

RDEPENDS:${PN} += ""

inherit rpm
