SUMMARY = "API documentation for Vc"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides the API documentation"
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "Vc-devel-doc-1.4.3-1.6.noarch.rpm"
RPM_HASH = "5e0abb4f2047c25dcd6ca2a6d77366165930dcaaa3a1aeb377ce8d9aea8220ef40af8e59f2756030b265b975709cb4cb0888fdd97b183db4380b5e0bbba16202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Vc-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
