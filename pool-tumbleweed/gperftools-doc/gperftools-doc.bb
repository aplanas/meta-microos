SUMMARY = "Documentation for performance tools for C++"
DESCRIPTION = "Documentation for gperftools package which contains some utilities to improve and analyze the \
performance of C++ programs"
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-doc-2.10-1.5.noarch.rpm"
RPM_HASH = "5e1201cac65735cdc4925536efd9d4fb8cb4a74f75366aa6fa0598dc3768de7cbfc68f926dbeefbb41905de0d7f4650708ed7bd65f2f50676fb45bfd94b87982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gperftools-doc"
RDEPENDS:${PN} += ""

inherit rpm
