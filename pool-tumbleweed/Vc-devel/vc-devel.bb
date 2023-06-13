SUMMARY = "Development Files for Vc"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides development headers needed to build software using Vc."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "Vc-devel-1.4.3-1.6.aarch64.rpm"
RPM_HASH = "4f26da63970bb7a5d333a992b00597eee6a8025f09595905e3e1635c0a1fc5b235e598821e135cbe46dd559d127559ccfb431539a9b6ccf4981f2362aae348f6"

RPROVIDES:${PN} += "Vc-devel \
Vc-devel(aarch-64) \
cmake(Vc)"

RDEPENDS:${PN} += "Vc-devel-static"

inherit rpm
