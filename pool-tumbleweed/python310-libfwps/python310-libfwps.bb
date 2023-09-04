SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "python310-libfwps-20230711-2.1.aarch64.rpm"
RPM_HASH = "693a665deafb6b878bf59e883727b4ebbeb60104fa428e853a4bfd0503b15a85fab16fda69b8d9d3692bae7b2e9a1656fdeda30110c1dcba7313684b7eb1c3b8"

RPROVIDES:${PN} += "python310-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
