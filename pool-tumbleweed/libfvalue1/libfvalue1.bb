SUMMARY = "Library to provide generic file value functions"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220120"

RPM_NAME = "libfvalue1-20220120-3.7.aarch64.rpm"
RPM_HASH = "b12d3fdfad9da200b11625e1701932ddb3ea9080012c39b71ff83e2ce099ec8be598037d0328c8d2c1682b52327b1c3adf054fd9bdef500c0981467db20b83e0"

RPROVIDES:${PN} += "libfvalue.so.1 \
libfvalue1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
