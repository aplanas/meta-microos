SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
clang that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "clang-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "930432da61e1dbfb1d3415e92b319bf6b0af6bd31b0384b41ddc0f2fb0bf75eced9468731deea059f3221813b71a683f71359f0db55cbff78d6aa8dc5c81fa07"

RPROVIDES:${PN} += "clang \
llvm-clang \
llvm-emacs-plugins"

RDEPENDS:${PN} += "clang16"

inherit rpm
