SUMMARY = "FIFO interface used by startproc"
DESCRIPTION = "The libaray for the FIFO interface used by the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.27"

RPM_NAME = "libblogger2-2.27-1.1.aarch64.rpm"
RPM_HASH = "7e9c54b8bf20e5997848cb443e585b880ea3b1e741ec8797bf8a9d937ee13492ec328f8011f253c06ae6f9b6aeaefff16a13c23e9c1973e4e9bf63bf067061bf"

RPROVIDES:${PN} += "blog-/usr/lib64/libblogger.so.2 \
libblogger.so.2 \
libblogger2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
