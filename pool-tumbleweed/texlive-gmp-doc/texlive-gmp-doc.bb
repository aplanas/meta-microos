SUMMARY = "Documentation for texlive-gmp"
DESCRIPTION = "This package includes the documentation for texlive-gmp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21691"

RPM_NAME = "texlive-gmp-doc-2023.201.1.0svn21691-53.1.noarch.rpm"
RPM_HASH = "aff3225a67611d4445dbf48b03dd61c0615f6052b7839f3de1b724c1f4806ff1059049236ab3fd971da568f37010156da69a51e144e45eeec3700a3201904fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmp-doc"
RDEPENDS:${PN} += ""

inherit rpm
