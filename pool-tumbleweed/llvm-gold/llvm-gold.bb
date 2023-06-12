SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM. \
 \
This package is a dummy package that depends on the version of \
llvm-gold that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-gold-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "e6a3f3a6296a6ad386a7862bff8515a60bf02c995e5a4cbd69aa056e0a4ec3209c3aef2954149d18aa6125a628ff5d54038d14c7e5c0e7800016cfac03d257e8"

RPROVIDES:${PN} += "llvm-gold \
llvm-gold(aarch-64)"
RDEPENDS:${PN} += "llvm16-gold"

inherit rpm
