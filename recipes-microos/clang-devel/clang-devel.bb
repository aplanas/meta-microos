SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files) \
 \
This package is a dummy package that depends on the version of \
clang-devel that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "clang-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "9af6f5d1b2c7e57e2927ccac83d36d091fc33fe093680d417f11d9041f44c758125467fd9f1102888971bef9aa680eb01b72acfa0dd70c70d8805a03dd0b518f"

RPROVIDES:${PN} += "clang-devel clang-devel(aarch-64) clang-devel-static llvm-clang-devel"
RDEPENDS:${PN} += "clang16-devel"

inherit rpm
