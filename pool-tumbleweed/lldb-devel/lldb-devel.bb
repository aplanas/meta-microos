SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB. \
 \
This package is a dummy package that depends on the version of \
lldb-devel that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "lldb-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "27327f2ffecf63cf2246f821997d563ee45a3f018b75c94c82e5654bc6f96422d76c91376a12063e13a4b6f8f96f71bd9f6d3d69be3166ea4ccde534d924f632"

RPROVIDES:${PN} += "lldb-devel"

RDEPENDS:${PN} += "lldb16-devel"

inherit rpm
