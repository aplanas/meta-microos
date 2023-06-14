SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "af85e63a268f1895379621af37d1e09faef852241da54e9da6c155c3a4638cf01df3496706af7b53dc75f3e291cab17ec1c4de3f35fe5bd4b38addb4ba4c4d77"

RPROVIDES:${PN} += "llvm-LTO-devel \
llvm-devel"

RDEPENDS:${PN} += "llvm-gold \
llvm16-devel"

inherit rpm
