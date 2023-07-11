SUMMARY = "Documentation for performance tools for C++"
DESCRIPTION = "Documentation for gperftools package which contains some utilities to improve and analyze the \
performance of C++ programs"
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-doc-2.10-1.6.noarch.rpm"
RPM_HASH = "e8154a24d0045adebc7e741bacaba5f73c607d3f5f19da2f2f4620d45d9e34a962fef055c7d498601ef0688a889d9710d17202a6a6bc65e80bbd821b5ee22341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gperftools-doc"

RDEPENDS:${PN} += ""

inherit rpm
