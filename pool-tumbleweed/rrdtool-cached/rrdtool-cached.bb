SUMMARY = "Data caching daemon for RRDtool"
DESCRIPTION = "rrdcached is a daemon that receives updates to existing RRD files, \
accumulates them and, if enough have been received or a defined time has \
passed, writes the updates to the RRD file.  The daemon was written with \
big setups in mind which usually runs into I/O related problems.  This \
daemon was written to alleviate these problems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-cached-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "924e09c3c14b79dc19028344ede5f453746adaaf64fb343447459c88e1c30f667628427fc17809e28508bc527a36b21918082e00d58158faac4a2d028ebf1769"

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
