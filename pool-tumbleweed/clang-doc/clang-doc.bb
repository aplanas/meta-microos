SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler. \
 \
This package is a dummy package that depends on the version of \
clang-doc that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "clang-doc-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "614ecbee96c8dfe204cf3be9453c22686f5772d3680cf08dd185ed249733ed63f52758866192f7cfeb3d5487a7a63912ed72416adc943339158fe2f80f5c9a8f"

RPROVIDES:${PN} += "clang-doc"

RDEPENDS:${PN} += "clang \
clang16-doc"

inherit rpm
