SUMMARY = "An example application using libproxy"
DESCRIPTION = "An example application that will use libproxy to give the results that can \
be expected from other applications. It can be used to debug what would \
happen in various cases."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy-tools-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "e6cdf21c2d7ac9417744a048133fb7d978b5aea5f1b9dac0a52ff85bd65bea09c893e6b6ceef9c4fb34c32817ef1ff9417508871cdd3b4fdf5a075a919f17e44"

RPROVIDES:${PN} += "libproxy-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libproxy.so.1 \
libproxy1"

inherit rpm
