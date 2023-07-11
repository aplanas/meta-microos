SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB. \
 \
This package is a dummy package that depends on the version of \
lldb-devel that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "lldb-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "c681aab0855759fbe2ba86e36c617b1591e0b4d4218d46e29c4ef36b3e5d92798a122d2721ab44f18a3fac503e50c122f00d94e5e8f746aaff7652875f75f85e"

RPROVIDES:${PN} += "lldb-devel"

RDEPENDS:${PN} += "lldb16-devel"

inherit rpm
