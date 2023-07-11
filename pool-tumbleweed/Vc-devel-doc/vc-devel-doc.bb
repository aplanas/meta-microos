SUMMARY = "API documentation for Vc"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides the API documentation"
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "Vc-devel-doc-1.4.3-1.7.noarch.rpm"
RPM_HASH = "36967862b8d5020fde3c0ed4c4a0ccf8948bdcaa26086816ceb68e01a1f5a36356e644ae53a2c2480683773db6f4d69dff7cb44b70dfa7cf9f9d49d1a04c11e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Vc-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
