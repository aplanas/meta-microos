SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files) \
 \
This package is a dummy package that depends on the version of \
clang-devel that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "clang-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "59a77a0a98dc6b73936b8e8b9669354fe99205a166b94f5d3cd471977cc390a30155a671548e99db9cb283fcfc7b82ae005c8d07610485817f8122351626ad47"

RPROVIDES:${PN} += "clang-devel \
clang-devel-static \
llvm-clang-devel"

RDEPENDS:${PN} += "clang16-devel"

inherit rpm
