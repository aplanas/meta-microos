SUMMARY = "Linux kernel trace event library"
DESCRIPTION = "The libtraceevent library provides APIs to access kernel tracepoint events located in the tracefs file system under the events directory."
LICENSE = "GPL-2.0-only"

PV = "1.7.3"

RPM_NAME = "libtraceevent1-1.7.3-1.1.aarch64.rpm"
RPM_HASH = "e994b57c00551d71c5f64303fdd88b41e58c3b0bad1fa8dca5777710dc106bcaee6315def05e23e5d57a449e841b80a7825c51315a16724dea36ac352e0dcfbb"

RPROVIDES:${PN} += "libtraceevent.so.1 \
libtraceevent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
