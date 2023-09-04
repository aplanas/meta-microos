SUMMARY = "Data caching daemon for RRDtool"
DESCRIPTION = "rrdcached is a daemon that receives updates to existing RRD files, \
accumulates them and, if enough have been received or a defined time has \
passed, writes the updates to the RRD file.  The daemon was written with \
big setups in mind which usually runs into I/O related problems.  This \
daemon was written to alleviate these problems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-cached-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "c76118d8685c2acc2d35b5d1e5c8b8828fcb386972ac94c5ecbf18f6f761a9f4500a9e2fc0af3a0b8720d842e1caf11714d16ee2335a2addb9e5e78f501b13ee"

RPROVIDES:${PN} += "rrdtool-cached"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
librrd.so.8 \
libwrap.so.0 \
rrdtool \
shadow"

inherit rpm
