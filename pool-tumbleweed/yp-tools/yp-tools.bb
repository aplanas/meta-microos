SUMMARY = "Network Information Service (YP) client utilities"
DESCRIPTION = "This packages contains some useful tools for accessing NIS maps or to \
test NIS configurations."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.2.3"

RPM_NAME = "yp-tools-4.2.3-3.12.aarch64.rpm"
RPM_HASH = "48b2fd9de127fb532991cdaa8e2b3ba90e1fd91f4e3a3220518f57e00cff897129f17f47b5fda91d69038e23f0eb9a44336ccb26b60b6a023ad6e4c6efdde7c2"

RPROVIDES:${PN} += "yp-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libnsl.so.3 \
libtirpc.so.3"

inherit rpm
