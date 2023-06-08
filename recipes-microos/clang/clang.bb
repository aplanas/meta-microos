SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
clang that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "clang-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "113bd3479a71df4b8022086738ef1f58a79a5504aa026ec6821ce27920a31cb1f0389d6be430bbe761e747a71cf796be5948e7684d8de1be4d5eded6e08ef0a4"

RPROVIDES:${PN} += "clang clang(aarch-64) llvm-clang llvm-emacs-plugins"
RDEPENDS:${PN} += "clang16"

inherit rpm
