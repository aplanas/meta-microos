SUMMARY = "Utilities to work with .solv files"
DESCRIPTION = "libsolv is a library for solving packages and reading repositories. \
 \
This subpackage contains utilities to create and work with the .solv \
files used by libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-tools-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "13b84654c2ab6f4cd7e4339b6b9491c26012ffe7f50678ce17894cd2563c777e015b263cce688dd9f40e6b828bb5026e97e4e6f699120d4d3ce5982d6330d676"

RPROVIDES:${PN} += "libsolv-tools \
libsolv-tools(aarch-64) \
satsolver-tools"

RDEPENDS:${PN} += "findutils \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
liblzma.so.5()(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
