SUMMARY = "Data caching daemon for RRDtool"
DESCRIPTION = "rrdcached is a daemon that receives updates to existing RRD files, \
accumulates them and, if enough have been received or a defined time has \
passed, writes the updates to the RRD file.  The daemon was written with \
big setups in mind which usually runs into I/O related problems.  This \
daemon was written to alleviate these problems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-cached-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "1aa470ddf5bf1d856dee344f730b2f663f9d6c189d9d31ce6a68e6db5e414a28e6820d8922f072c1e8264e8e50d0d387306de1d6f077a19fdc70180d0f2a1b61"

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
