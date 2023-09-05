SUMMARY = "X11 RECORD Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-record0-1.16-1.1.aarch64.rpm"
RPM_HASH = "69becca16ea62afa0d256c6c790ae97a8960a6c4d5b0bff22b2ec3bd333cadcb6b7a57677430eec7e695b91e4e08f06ee0cdb6b673eebac23d202da0d297e4e1"

RPROVIDES:${PN} += "libxcb-record.so.0 \
libxcb-record0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
