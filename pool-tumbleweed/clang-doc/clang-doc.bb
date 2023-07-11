SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler. \
 \
This package is a dummy package that depends on the version of \
clang-doc that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "clang-doc-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "e165316a3f5c7f645c7a84802d7f2f50486822c4db5434d308c0b6701ef00eacb9a6ed97a2e2dde2db8765becf0fed010820759273b87b57352132e743db19b4"

RPROVIDES:${PN} += "clang-doc"

RDEPENDS:${PN} += "clang \
clang16-doc"

inherit rpm
