SUMMARY = "Utilities for reading Windows thumbnail cache databases"
DESCRIPTION = "This subpackage contains the utility programs from libwtcdb to \
read Windows thumbnail cache databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb-tools-20210417-3.3.aarch64.rpm"
RPM_HASH = "f974d99a7b01d90681c93c7ceafc5893ab2b3e77622fc5618dc15ea4ee16db2ded7ad946ca58bd99b702a917b1b5f7cecb6bb6f9a56c42a7899e5b81ffa551bc"

RPROVIDES:${PN} += "libwtcdb-tools \
libwtcdb-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcfile.so.1()(64bit) \
libcfile.so.1(V_20220106)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libwtcdb.so.1()(64bit) \
libwtcdb.so.1(V_20210417)(64bit)"

inherit rpm
