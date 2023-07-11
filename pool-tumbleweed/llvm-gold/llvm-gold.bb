SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM. \
 \
This package is a dummy package that depends on the version of \
llvm-gold that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-gold-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "a30a6af7cda7befc8029d1e33f189ffb64a184cba60d707c3ff15e310f69295a86ab0d9454b72c5ab10697e285e264ac2032859f00f5e94e87f78c333c744386"

RPROVIDES:${PN} += "llvm-gold"

RDEPENDS:${PN} += "llvm16-gold"

inherit rpm
