SUMMARY = "Tools to manipulate LDB files"
DESCRIPTION = "Tools to manipulate LDB files."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "ldb-tools-2.7.2-1.2.aarch64.rpm"
RPM_HASH = "c7ebff0bd5906a0d4a0ac0fc56fcf9fa66f45522b4fe740d0ca5ccbed884d074010af515632bc9cde2e07345d4fb1db4744f60ecf818fc7b509fc3e249934243"

RPROVIDES:${PN} += "ldb-tools \
libldb-cmdline.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libpopt.so.0 \
libtalloc.so.2"

inherit rpm
