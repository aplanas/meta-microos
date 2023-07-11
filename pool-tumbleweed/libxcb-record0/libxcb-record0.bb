SUMMARY = "X11 RECORD Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-record0-1.15-2.3.aarch64.rpm"
RPM_HASH = "2d0385d101a1a04802945c75e654550a7693b1e148f87f3844fd1faec7124e6d18ae71f37b72695082bb6fed95fc891573f3f9c59184002b1fafe3a86a120d5c"

RPROVIDES:${PN} += "libxcb-record.so.0 \
libxcb-record0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
