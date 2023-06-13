SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
clang that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "clang-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "0d7f8ad444315164832ee0461c9546d997857a80f0d1f88bea9bf06d996dc1f03e869f6688f2a24139ff1e061be1b309bad7b8f6d8982d1b7d120aeb64466bef"

RPROVIDES:${PN} += "clang \
clang(aarch-64) \
llvm-clang \
llvm-emacs-plugins"

RDEPENDS:${PN} += "clang16"

inherit rpm
